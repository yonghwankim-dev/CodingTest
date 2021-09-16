package BOJ_10988;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	/**
	 * 매개변수(str)의 문자열이 팰린드롬인지 검사
	 * 팰린드롬이란 앞에서 읽으나 뒤에서 읽으나 동일한 문자이다.
	 * ex) level
	 */
	public static int solution(String str)
	{
		StringBuilder sb = new StringBuilder(str);
		String rever_str = sb.reverse().toString();
		
		return str.equals(rever_str) ? 1 : 0;
	}
	
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		System.out.println(solution(str));
	}
}
