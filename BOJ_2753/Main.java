package BOJ_2753;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int year;
		int answer = 0;

		year = Integer.parseInt(br.readLine());
		
		if((year%4==0 && year%100!=0) || year%400==0)
		{
			answer = 1;
		}
		System.out.print(answer);
	}
}
