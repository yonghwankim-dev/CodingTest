package PROM_42839;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution{
	
	static int[] nums;
	static int N;
	public static void swap(int a, int b)
	{
		int temp = nums[a];
		nums[a] = nums[b];
		nums[b] = temp;
	}
	
	public static void recursion(int n)
	{
		if(n==1)
		{
			for(int i=0;i<N;i++)
			{
				System.out.print(nums[i] + " ");
			}
			System.out.println();
		}
		for(int i=0; i<n; i++)
		{
			swap(i, n-1);
			recursion(n-1);
			swap(n-1,i);
		}
	}
	
    public static int solution(String numbers) {
       int answer = 0;
       int n = N = numbers.length();
       
       List<Integer> list = new ArrayList<Integer>();
       
       nums = new int[n];
       
       
       for(int i=0;i<numbers.length();i++)
       {
    	   nums[i] = numbers.charAt(i) - 48;
       }
       
       recursion(n);
       
       return answer;
    }
    
	public static void main(String args[])
	{
		solution("17");
	}
}