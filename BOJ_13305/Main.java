package BOJ_13305;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String[] dis_ = br.readLine().split(" ");
		long[] dis = new long[dis_.length];
		for(int i=0;i<dis_.length;i++)
		{
			dis[i] = Integer.parseInt(dis_[i]);
		}
		
		String[] city_ = br.readLine().split(" ");
		long[] city = new long[city_.length];
		for(int i=0;i<city_.length;i++)
		{
			city[i] = Integer.parseInt(city_[i]);
		}
		
		long answer = 0;
		int dis_idx = 0;
		int city_idx =0;
		long prev_city = 0;
		while(city_idx<city.length-1)
		{
			if(city_idx==0)
			{
				answer += (city[city_idx]*dis[dis_idx]);
				prev_city = city[city_idx];
				city_idx++;
				dis_idx++;
			}
			else
			{
				if(city[city_idx]<=prev_city)
				{
					answer += (city[city_idx]*dis[dis_idx]);
					prev_city = city[city_idx];
					city_idx++;
					dis_idx++;
				}
				else 
				{
					answer += (prev_city*dis[dis_idx]);
					city_idx++;
					dis_idx++;
				}
			}
		}
		System.out.println(answer);
		
	}
}
