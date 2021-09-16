package BOJ_2164;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;


public class Main {
	public static int solution(Queue<Integer> q)
	{
		while(q.size()!=1)	// queue 구조에서 1개가 남을때까지 반복
		{
			q.poll();	// 카드한장을 버림
			q.add(q.poll());	// 제일 위의 카드를 제일 뒤로 보냄
		}
		return q.peek();	// queue 구조의 마지막 1개 남은 카드의 수를 반환
	}
	
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Queue<Integer> q = new LinkedList<Integer>();
		for(int i=1;i<=n;i++)
		{
			q.add(i);
		}
		
		System.out.println(solution(q));
	}
}
