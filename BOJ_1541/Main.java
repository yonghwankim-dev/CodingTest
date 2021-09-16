package BOJ_1541;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String exp = br.readLine();
		StringTokenizer st = new StringTokenizer(exp,"-");
		int sum = Integer.MAX_VALUE;
		while(st.hasMoreTokens())
		{
			int temp = 0;
			StringTokenizer add = new StringTokenizer(st.nextToken(),"+");	// 뺄셈으로 나눈 토큰을 덧셈으로 분리하여 해당 토큰들을 더한다.
			
			while(add.hasMoreTokens())
			{
				temp += Integer.parseInt(add.nextToken());
			}
			
			// 첫번째 토큰인경우 temp값이 첫번째 수가 된다.
			if(sum==Integer.MAX_VALUE)
			{
				sum = temp;
			}
			else
			{
				sum -= temp;
			}
		}
		System.out.println(sum);
	}
}
