package BOJ_14501;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	private static int[] t;
	private static int[] p;
	private static int[] dp;	// n일까지의 이익
	public static int solution(int i, int n)
	{
		if(i==0)	// 0일차의 최대이익은 0원
		{
			return 0;
		}
		
		if(i+t[i]<=n+1)
		{
			// i-1일차까지의 최대이익 VS i일차의 이익을 포함한 i-1일차까지(퇴사일 변경)의 최대이익
			return Math.max(solution(i-1,n), solution(i-1,i-1)+p[i]);	
		}
		return solution(i-1,n);	// i일차를 포함하지 않는 경우
	}
	
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());	// 일수
		dp = new int[n+1];	// n일을 기준으로 받을 수 있는 최고 보수
		t = new int[n+1];	// 상담 일수
		p = new int[n+1];	// 보수 금액
		
		for(int i=1;i<=n;i++)
		{
			String[] str = br.readLine().split(" ");
			t[i] = Integer.parseInt(str[0]);
			p[i] = Integer.parseInt(str[1]);
		}
		System.out.println(solution(n,n));
	}
}
