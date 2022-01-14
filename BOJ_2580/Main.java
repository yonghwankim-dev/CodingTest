package BOJ_2580;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {
	static int[][] map = {
			{0, 3, 5, 4, 6, 9, 2, 7, 8},
			{7, 8, 2, 1, 0, 5, 6, 0, 9},
			{0, 6, 0, 2, 7, 8, 1, 3, 5},
			{3, 2, 1, 0, 4, 6, 8, 9, 7},
			{8, 0, 4, 9, 1, 3, 5, 0, 6},
			{5, 9, 6, 8, 2, 0, 4, 1, 3},
			{9, 1, 7, 6, 5, 2, 0, 8, 0},
			{6, 0, 3, 7, 0, 1, 9, 5, 2},
			{2, 5, 8, 3, 9, 4, 7, 6, 0}
	};
	static int n = 9;
	public static String solution()
	{
		for(int y=0; y<n; y++)
		{
			for(int x=0; x<n; x++)
			{
				if(map[y][x]==0)
				{
					System.out.printf("(%d,%d)\n", y,x);
				}
			}
		}
		return null;
	}
	
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		int[][] map = new int[n][n];
//		
//		for(int i=0;i<n;i++)
//		{
//			String[] line = br.readLine().split(" ");
//			map[i] = Arrays.stream(line).mapToInt(Integer::parseInt).toArray();
//		}
		
		solution();
	}
}
