//package CSES_1068;
// title : Weird Algorithm

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
	public static void solution(long n)
	{
		long n_ = n;
				
		while(true)
		{
			System.out.print(n_+" ");
			if(n_==1)
			{
				break;
			}
			else if(n_%2==0)
			{
				n_ = n_/2;
			}
			else 
			{
				n_ = n_*3+1;
			}
		}
		
	}
	
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Integer.parseInt(br.readLine());
		solution(n);
	}
}
