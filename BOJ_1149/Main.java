package BOJ_1149;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {
	
	
	static class House{
		int red, green, blue;
		int cur_cost;
		String color;
		
		public House(int red, int green, int blue)
		{
			this.red = red;
			this.green = green;
			this.blue = blue;
		}

		@Override
		public String toString() {
			return "House [red=" + red + ", green=" + green + ", blue=" + blue + ", cur_cost=" + cur_cost + ", color="
					+ color + "]";
		}
	}
	
	public static int solution(House[] dp)
	{
		
		return 0;
	}
	
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		House[] dp = new House[1001];
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0;i<n;i++)
		{
			int[] rgb = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			dp[i] = new House(rgb[0], rgb[1], rgb[2]);
		}
		
		solution(dp);
	}
}
