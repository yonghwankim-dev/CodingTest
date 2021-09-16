package BOJ_1966_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;




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

	public static int solution(List<Node> printer, PriorityQueue<Integer> prioritys, int target)
	{
		int count=0;
		while(!printer.isEmpty())
		{
			Node node = printer.remove(0);
			
			// printer 큐의 맨 앞에 있는 문서의 우선순위가 prioritys 우선순위큐의 제일 앞에 있는 우선순위와 같은지 검사
			if(node.priority==prioritys.peek())
			{
				prioritys.poll();
				count++;
				if(node.id==target)
				{
					break;
				}
			}
			else
			{
				printer.add(node);
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
			
			str = br.readLine().split(" ");
			
			List<Node> printer = new ArrayList<>();
			PriorityQueue<Integer> prioritys = new PriorityQueue<Integer>(Collections.reverseOrder());
			
			
			for(int i=0;i<N;i++)
			{	
				printer.add(new Node(Integer.parseInt(str[i]),i));
				prioritys.add(Integer.parseInt(str[i]));
			}
			System.out.println(solution(printer, prioritys, target));
			
		}
	}
}


