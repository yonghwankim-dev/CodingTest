package PROM_60057;

/**
 * 프로그래머스 다른 사람 풀이
 * @author qkdlf
 *
 */
public class Solution2 {
	public int solution(String s)
	{
		int answer = 0;
		
		for(int i=1;i<=(s.length())+1;i++)
		{
			int result = getSplitedLength(s,i,1).length();
			answer = i==1 ? result : (answer>result ? result : answer);
		}
		return answer;
	}

	/**
	 * 
	 * @param s 잘리는 문자열
	 * @param n 자르는 개수 단위
	 * @param repeat 반복된 횟수
	 * @return
	 */
	public String getSplitedLength(String s, int n, int repeat) {
		// base case
		if(s.length()<n)
		{
			return s;
		}
		
		String result = "";
		String preString = s.substring(0,n);
		String postString = s.substring(n,s.length());
		
		// 불일치 -> 현재까지 [반복횟수+반복문자] 조합
		if(!postString.startsWith(preString))
		{
			if(repeat==1)
			{
				return result += preString + getSplitedLength(postString, n, 1);
			}
			return result += Integer.toString(repeat) + preString + getSplitedLength(postString, n, 1);
		}
		return result += getSplitedLength(postString, n, repeat+1);
	}
	
	
}
