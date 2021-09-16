package BOJ_1620;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/*배열, 이름과 번호의 클래스, 이분탐색 활용, 사전순 정렬*/

public class Main {
	static Map<String, Integer> map = new HashMap<String, Integer>();
	
	// 문자열이 숫자인지 검사
	public static boolean checkDigit(String str)
	{
		boolean isNumeric = true;
		for(int i=0;i<str.length();i++)
		{
			if(!Character.isDigit(str.charAt(i)))
			{
				isNumeric = false;
			}
		}
		return isNumeric;
	}
	
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int p = Integer.parseInt(str[1]);
		
		for(int i=1;i<=n;i++)
		{
			map.put(br.readLine(), i);
		}
		
		for(int i=0;i<p;i++)
		{
			String in = br.readLine();
			if(map.containsKey(in))
			{
				System.out.println(map.get(in));
			}
			else if(checkDigit(in))	// 숫자인지 검사
			{
				
				if(map.containsValue(Integer.parseInt(in)))	// map에 포함되어 있는지 검사
				{
					// in에 따른 key값을 출력
					map.forEach((key, value) ->{
						if(Integer.parseInt(in)==value)
						{
							System.out.println(key);
						}
					});
				}
			}
			
		}
	}
}
