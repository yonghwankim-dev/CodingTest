package BOJ_1212;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	private static String[] map = {"000","001","010","011","100","101","110","111"};
	
	/* 8진수를 입력받으면 2진수로 변환시켜준다.*/
	public static String solution(String n)
	{
		StringBuilder answer = new StringBuilder();
		
		/* 수가 0인 경우*/
		if(n.equals("0"))
		{
			return "0";
		}
		
		/* 8진수를 앞의 숫자부터 참조하여 2진수로 변경한다.*/
		for(int i=0;i<n.length(); i++)
		{
			answer.append(map[Integer.parseInt(String.valueOf(n.charAt(i)))]);
		}
		
		/* 2진수의 맨 앞자리의 0들을 제거 */
		while(answer.charAt(0)=='0')
		{
			answer = answer.deleteCharAt(0);
		}
		
		
		return answer.toString();
		
	}
	
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println(solution(br.readLine()));
		
	}
}
