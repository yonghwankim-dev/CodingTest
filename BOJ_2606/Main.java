package BOJ_2606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;


public class Main {
	public static LinkedList<Integer>[] nodeList;
	
	public static int bfs(int node, boolean[] visited)
	{
		Queue<Integer> queue = new LinkedList<Integer>();
		int answer = -1;
		
		queue.offer(node);
		
		while(!queue.isEmpty()) 
		{
			node = queue.poll();
			
			if(visited[node])
			{
				continue;
			}
			
			answer++;
			visited[node] = true;
			for(int nextNode : nodeList[node])
			{
				queue.add(nextNode);
			}
		}
		
		return answer;
	}
	
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int e = Integer.parseInt(br.readLine());
		
		nodeList = new LinkedList[n+1];
		
		for(int i=0;i<=n;i++)
		{
			nodeList[i] = new LinkedList<Integer>(); 
		}
		
		for(int i=0;i<e;i++)
		{
			String[] str = br.readLine().split(" ");
			int start = Integer.parseInt(str[0]);
			int end = Integer.parseInt(str[1]);
			
			nodeList[start].add(end);
			nodeList[end].add(start);
			
			Collections.sort(nodeList[start]);
			Collections.sort(nodeList[end]);
		}
		
		boolean[] visited = new boolean[n+1];
		
		int answer = bfs(1, visited);
		System.out.println(answer);
	}
}
