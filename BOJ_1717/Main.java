package BOJ_1717;


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
		
		String[] input = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);
		int[] subsets = new int[n+1];
		
		for(int i=0;i<=n;i++)
		{
			subsets[i] = i;
		}
		
		for(int i=0;i<m;i++)
		{
			input = br.readLine().split(" ");
			int op = Integer.parseInt(input[0]);
			int x = Integer.parseInt(input[1]);
			int y = Integer.parseInt(input[2]);
			
			if(op==0)
			{
				int xroot = find(subsets, x);
				int yroot = find(subsets, y);
				union(subsets,xroot,yroot);
			}
			else if(op==1)
			{
				int xroot = find(subsets, x);
				int yroot = find(subsets, y);
				
				if(xroot==yroot)
				{
					System.out.println("YES");
				}
				else
				{
					System.out.println("NO");
				}
			}
		}
	}
}
