package BOJ_1032;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Main {
	
	/* files들의 패턴 탐색*/
	public static String solution(List<String> files)
	{
		/* 초기 패턴 문자열 */
		String pattern = files.get(0);
		
		/* 각각의 파일들과 pattern을 비교하여 최종 패턴을 생성한다. */
		for(int i=1; i<files.size(); i++)
		{
			String dummy = "";
			/* 하나의 파일과 패턴의 문자들을 하나씩 비교하여 문자가 틀린 경우 해당 자리를 ?로 채운다.*/
			for(int j=0; j<files.get(i).length(); j++)
			{
				if(files.get(i).charAt(j)==pattern.charAt(j))
				{
					dummy += pattern.charAt(j);
				}
				else
				{
					dummy += "?";
				}
			}
			pattern = dummy;
		}
		return pattern;
	}
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<String> files = new ArrayList<>();
		
		for(int i=0;i<n;i++)
		{
			files.add(br.readLine());
		}
		String pattern = solution(files);
		System.out.println(pattern);
	}
}
