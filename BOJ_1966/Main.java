package BOJ_1966;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;



public class Main {
	
	static class Node{
		int priority;	// 중요도
		int id;			// 문서 id
		
		public Node(int priority, int id) {
			this.priority = priority;
			this.id = id;
		}

		@Override
		public String toString() {
			return "Node [priority=" + priority + ", id=" + id + "]";
		}
		
		

	}
	
	public static int solution(List<Node> printer, int target)
	{
		int count=0;
		while(!printer.isEmpty())
		{
			Node node = printer.get(0);
			
			/* node보다 높은 우선순위를 가진 다른 node가 있는지 탐색한다. */
			boolean flag = false;
			for(int i=1;i<printer.size();i++)
			{
				if(node.priority<printer.get(i).priority)
				{
					flag = true;
					break;
				}
			}
			/* flag==true이면 node보다 높은 우선순위의 문서가 있는 것이므로 리스트의 뒤로 보낸다.*/
			printer.remove(0);
			if(flag==true)
			{
				printer.add(node);
			}else
			{
				count++;
				if(node.id==target)
				{
					return count;
				}
			}
		}
		return count;
	}
	
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int tc = Integer.parseInt(br.readLine());		// 테스트케이스 개수
		
		for(int t=0;t<tc;t++)
		{
			String[] str = br.readLine().split(" ");
			int N = Integer.parseInt(str[0]);		// 문서 개수
			int target = Integer.parseInt(str[1]);	// 몇번째로 인쇄하는지 궁금한 문서id
			int[] nodes = new int[N];
			str = br.readLine().split(" ");
			for(int i=0;i<nodes.length;i++)
			{
				nodes[i] = Integer.parseInt(str[i]);
			}
			
			
			List<Node> printer = new ArrayList<>();
			
			for(int i=0;i<N;i++)
			{	
				printer.add(new Node(nodes[i],i));
			}
			
			
			System.out.println(solution(printer, target));
		}
	}
}
