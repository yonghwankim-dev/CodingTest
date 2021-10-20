package BOJ_10844;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static int answer = 0;
	
	public static void recursion(int i, int cur_len, int n)
	{
		if(i>=10 || i<0)
		{
			return;
		}
		else if(cur_len>=n)
		{
			answer++;
			return;
		}
		else
		{
			recursion(i-1, cur_len+1, n);
			recursion(i+1, cur_len+1, n);
		}
	}
	
	public static void solution(int n)
	{
		answer = 0;
		for(int i=1;i<=9;i++)
		{
			recursion(i, 1, n);
		}
	}
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		solution(n);
		System.out.println(answer%1000000000L);
	}
}
