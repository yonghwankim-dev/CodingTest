package BOJ_1932;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {	
	public static int solution(int[][] matrix, int i, int j)
	{
		if(i<0)
		{
			return 0;
		}
		
		int col;
		if(j-1<0)
		{
			col = j;
		}else 
		{
			if(matrix[i-1][j-1]>=matrix[i-1][j])
			{
				col = j-1;
			}
			else 
			{
				col = j;
			}
		}
		
		return matrix[i][j] + solution(matrix, i-1, col);
	}
	
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[][] matrix = new int[n][n];
		
		for(int i=0;i<n;i++)
		{
			String[] str = br.readLine().split(" ");
			for(int j=0;j<str.length;j++)
			{
				matrix[i][j] = Integer.parseInt(str[j]);
			}
		}
		
		int max = Integer.MIN_VALUE;
		for(int j=0;j<matrix[matrix.length-1].length;j++)
		{
			int result = solution(matrix, matrix.length-1, j);
			if(max<result)
			{
				max = result;
			}
		}
		System.out.println(max);
	}
}
