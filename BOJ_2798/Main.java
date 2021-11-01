package BOJ_2798;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
	public static long solution(int n, int m, int[] cards)
	{
		long value = 0;
		
		for(int i=0;i<n-2; i++)
		{
			if(cards[i]>m)
			{
				continue;
			}
			
			for(int j=i+1; j<n-1; j++)
			{
				if(cards[i]+cards[j]>m)
				{
					continue;
				}
				
				for(int k=j+1; k<n; k++)
				{
					int sum = cards[i]+cards[j]+cards[k];
					if(sum>m)
					{
						continue;
					}
					else
					{
						if(sum>value)
						{
							value = sum; 
						}
					}
				}
			}
		}
		
		return value;
	}
	
	public static long solution2(int n, int m, int[] cards)
	{
		long max = 0;
		
		for(int i=0;i<n-2; i++)
		{	
			for(int j=i+1; j<n-1; j++)
			{	
				for(int k=j+1; k<n; k++)
				{
					int sum = cards[i]+cards[j]+cards[k];
					if(sum<=m && sum>max)
					{
						max = sum;
					}
				}
			}
		}
		
		return max;
	}
	
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		
		int[] cards = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		System.out.println(solution2(n, m, cards));
	}
}
