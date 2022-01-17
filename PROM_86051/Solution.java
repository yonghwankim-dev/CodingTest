package PROM_86051;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Solution {
	public static int solution(int[] numbers)
	{
		boolean[] flag = new boolean[10];
		
		for(int n : numbers)
		{
			flag[n] = true;
		}
		
		int sum = 0;
		for(int i=0;i<flag.length;i++)
		{
			if(!flag[i])
			{
				sum+=i;
			}
		}
		
		return sum;
	}
	
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//int[] numbers = {1,2,3,4,6,7,8,0};
		int[] numbers = {5,8,4,0,6,7,9};
		System.out.println(solution(numbers));
	}
}
