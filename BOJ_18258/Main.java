package BOJ_18258;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Main {
	static class Queue2{
		static List<Integer> queue;
		
		public Queue2() {
			queue = new ArrayList<Integer>(); 
		}
		
		public static void push(int x){
			queue.add(x);
		}
		public static int pop() {
			if(empty()==1) {
				return -1;
			}
			return queue.remove(0);
		}
		public static int size() {
			return queue.size();
		}
		public static int empty() {
			return (queue.size()==0 ? 1 : 0);
		}
		public static int front() {
			if(empty()==1) {
				return -1;
			}
			return queue.get(0);
		}
		public static int back() {
			if(empty()==1) {
				return -1;
			}
			return queue.get(queue.size()-1);
		}
		
	}
	
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue2 q = new Queue2();
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0;i<n;i++){
			String[] str = br.readLine().split(" ");
			
			switch(str[0])
			{
			case "push":
				q.push(Integer.parseInt(str[1]));
				break;
			case "pop":
				System.out.println(q.pop());
				break;
			case "size":
				System.out.println(q.size());
				break;
			case "empty":
				System.out.println(q.empty());
				break;
			case "front":
				System.out.println(q.front());
				break;
			case "back":
				System.out.println(q.back());
				break;
			default:
				break;
			}
		}
		
	}
}
