package BOJ_9663;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main2 {
	
	public static int hashCode(String s) {
		int g=31;
		int hash=0;
		// 문자열을 숫자로 나타내기
		// 상수 g를 문자의 위치만큼 제곱한 뒤 곱합니다.
		for (int i=0; i<s.length(); i++)
			hash = (int) (Math.pow(g, i) * s.charAt(i));
		return hash;
	}
	
	
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(hashCode("this"));
		
	}
}
