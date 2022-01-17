package PROM_42889;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class Solution {
	public static int[] solution(int N, int[] stages)
	{
		Arrays.sort(stages);
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i=1;i<=N;i++)
		{
			map.put(i, 0);
		}
		
		for(int i=0;i<stages.length;i++)
		{
			if(!map.containsKey(stages[i]) && stages[i]<=N)
			{
				map.put(stages[i], 1);
			}
			if(map.containsKey(stages[i]))
			{
				map.put(stages[i], map.get(stages[i])+1);
			}	
		}
		System.out.println(map.toString());
		
		return null;
	}
	
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
		solution(5, stages);
		
	}
}
