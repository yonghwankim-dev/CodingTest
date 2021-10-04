package BOJ_14888;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
	static List<String> list = new ArrayList<>();
	
	public static void solution(int N, int[] arr, int[] op)
	{
		if(list.size()==2*N-1)
		{
			System.out.println(list);
			return;
		}
		else {
			for(int i=0; i<N; i++)
			{
				list.add(String.valueOf(arr[i]));
				String operation = "";
				if(i==0)
				{
					operation = "+"; 
				}
				else if(i==1)
				{
					operation = "-";
				}
				else if(i==2)
				{
					operation = "*";
				}
				else if(i==3)
				{
					operation = "/";
				}
				list.add(op[i]);
				solution(N, arr, op);
				list.remove(list.size()-1);
			}	
		}
		
		
		
	}
	
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int[] op = new int[4];
		
		// 피연산자 입력
		String[] str = br.readLine().split(" ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = Integer.parseInt(str[i]);
		}
		
		str = br.readLine().split(" ");
		for(int i=0;i<4;i++)
		{
			op[i] = Integer.parseInt(str[i]);
		}
		
		solution(N, arr, op);
		
	}
}
