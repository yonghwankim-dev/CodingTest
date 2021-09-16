package BOJ_1260;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;


public class Main {
	
	public static LinkedList<Integer>[] nodeList;
	
	public static void dfs(int node, boolean[] visited, StringBuilder sb)
	{
		if(visited[node])
		{
			return;
		}
		
		visited[node] = true;
		sb.append(node + " ");
		for(int nextNode : nodeList[node])
		{
			dfs(nextNode,visited,sb);
		}
	}
	
	public static void bfs(int node, boolean[] visited, StringBuilder sb)
	{
		Queue<Integer> queue = new LinkedList<Integer>();
		
		queue.offer(node);
		
		while(!queue.isEmpty())
		{
			node = queue.poll();
			
			if(visited[node])
			{
				continue;
			}
			
			visited[node] = true;
			sb.append(node + " ");
			
			for(int nextNode : nodeList[node])
			{
				queue.add(nextNode);
			}
		}
	}
	
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str[] = br.readLine().split(" ");
		int N = Integer.parseInt(str[0]);	// 정점개수
		int M = Integer.parseInt(str[1]);	// 간선개수
		int V = Integer.parseInt(str[2]);	// 시작위치
		
		nodeList = new LinkedList[N+1];
		for(int i=0;i<=N;i++)
		{
			nodeList[i] = new LinkedList<Integer>(); 
		}
		
		for(int i=0;i<M;i++)
		{
			str = br.readLine().split(" ");
			int x = Integer.parseInt(str[0]);
			int y = Integer.parseInt(str[1]);
			
			nodeList[x].add(y);
			nodeList[y].add(x);
			
			Collections.sort(nodeList[x]);
			Collections.sort(nodeList[y]);
		}
		
		StringBuilder dfsAnswer = new StringBuilder();
		StringBuilder bfsAnswer = new StringBuilder();
		
		boolean[] dfsVisited = new boolean[N+1];
		boolean[] bfsVisited = new boolean[N+1];
		
		dfs(V, dfsVisited, dfsAnswer);
		bfs(V, bfsVisited, bfsAnswer);
		
		System.out.println(dfsAnswer);
		System.out.println(bfsAnswer);
		
	}

	
}
