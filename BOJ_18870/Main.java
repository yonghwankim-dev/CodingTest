package BOJ_18870;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Main {
	
	public static int findRank(int[] origin_arr, List<Integer> list, int idx)
	{
		int rank = 0;
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i)<origin_arr[idx])
			{
				rank++;
			}
		}
		return rank; 
	}
	
	public static void solution(int[] origin_arr, List<Integer> list)
	{
		Collections.sort(list);
		int[] answer = new int[origin_arr.length];
		
		for(int i=0;i<origin_arr.length;i++)
		{
			answer[i] = findRank(origin_arr, list, i); 
		}
		
		System.out.println(Arrays.toString(answer));
	}
	
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String[] str = br.readLine().split(" ");
		int[] origin_arr = Arrays.stream(str).mapToInt(Integer::parseInt).toArray();
		
		ArrayList<Integer> list = new ArrayList<>();
		for(int item : origin_arr)
		{
			list.add(item);
		}
		
		solution(origin_arr, list);
		
		
	}
}
