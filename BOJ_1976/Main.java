package BOJ_1976;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {
	public static int find(int[] subsets, int x)
	{
		if(subsets[x]!=x)
		{
			return subsets[x] = find(subsets, subsets[x]);
		}
		return subsets[x];
	}
	
	public static void union(int[] subsets, int x, int y)
	{
		subsets[x] = y;
	}
	
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		
		int[][] matrix = new int[n][n];
		boolean[] visited = new boolean[m];
		
		for(int i=0;i<n;i++)
		{
			String[] str = br.readLine().split(" ");
			for(int j=0;j<n;j++)
			{
				matrix[i][j] = Integer.parseInt(str[j]);
			}
		}
		
		
		
		
	}
}
