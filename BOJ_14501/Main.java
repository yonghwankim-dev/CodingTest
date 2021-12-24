package BOJ_14501;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	static int[] t;
	static int[] p;
	static int[] dp;	// n일까지의 이익
	public static int solution(int n)
	{
		if(n==0)
		{
			return 0;
		}
		if(n+t[n]<n+1)
		{
			return Math.max(p[n]+solution(n-1), n);
		}
		return 0;
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
		System.out.println(solution(n));
		
//		n = 5;
//		t = new int[n+1];
//		p = new int[n+1];
//		
//		t[1] = 3;
//		t[2] = 5;
//		t[3] = 1;
//		t[4] = 1;
//		t[5] = 2;
//		
//		p[1] = 10;
//		p[2] = 20;
//		p[3] = 10;
//		p[4] = 20;
//		p[5] = 15;
				
	}
}
