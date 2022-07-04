package PROM_60057;



public class Solution {
	static StringBuilder sb = new StringBuilder();
	
	/**
	 * 
	 * @param p 문자열의 인덱스
	 * @param sepaUnit 문자열 압축 단위
	 * @param repeat 문자열이 반복되는 횟수
	 * @param s 문제로 주어진 문자열
	 */
	public static void capsulate(int p, int sepaUnit, int repeat, String s)
	{
		while(p<s.length())
    	{
    		String sub;
    		
    		if(p + sepaUnit > s.length() - 1) // p+i가 마지막 문자까지 탐색했는지 검사
    		{
    			sub = s.substring(p); // p부터 마지막문자까지 sub에 저장    			
    			sb.append(repeat==1 ? sub : repeat+sub); // sub가 단일문자라면 숫자없이 연결
    			break;
    		}
    		else
    		{
    			sub = s.substring(p, p + sepaUnit); // s[p] ~ s[p+i-1]까지 추출하여 저장
    		}
    		
    		
    		int next_start = p + sepaUnit;
    		int next_end = p + sepaUnit + sepaUnit;
    		
    		// 현재 문자열의 다음 문자열 세트
    		// 예를 들어 문자열 s = "ababcdcdababcdcd"이고
    		// p = 0, i = 1이라면 sub = a,  next_sub = b입니다.
    		// p = 0, i = 2이라면 sub = ab, next_sub = ab입니다. 
    		String next_sub; 
    		        
    		
    		if(next_end>=s.length()+1) // next_end의 범위가 문자열의 subString 범위를 넘어서는 경우
    		{
    			next_sub = s.substring(next_start);
    		}
    		else // 그외의 경우 다음 문자열 세트를 추출합니다.
    		{
    			next_sub = s.substring(next_start, next_end);
    		}
    		
    		
    		if(sub.equals(next_sub)) // 현재 문자열 세트와 다음 문자열 세트가 동일한 경우
    		{
    			repeat++;
    		}
    		else // 현재 문자열 세트와 다른 문자열 세트인 경우 문자열 압축을 수행함
    		{
    			if(repeat>=2)
    			{
    				sb.append(repeat+sub);
    				repeat=1;
    			}
    			else // 문자열 세트 개수가 단일인 경우 숫자를 생략
    			{
    				sb.append(sub);
    			}
    		}
    		p += sepaUnit; // 다음 문자열 세트로 이동
    	}
	}
	
    public static int solution(String s) {
        int answer = 0;
        
        int min_value = s.length(); // 최소 문자열의 압축 길이
        
        // sepaUnit : 문자열 압축 단위, 1, 2, 3, ...
        for(int sepaUnit = 1; sepaUnit <= s.length() / 2; sepaUnit++)
        {
        	int p = 0;
        	int repeat = 1;

        	capsulate(p, sepaUnit, repeat, s); // 문자열 압축
        	
        	
        	min_value = Math.min(min_value, sb.length()); // 최소값 탐색
        	sb = new StringBuilder(); // StringBuilder 초기화
        	System.out.println();
        }
        
        answer = min_value;
        return answer;
    }
	public static void main(String[] args) {
		System.out.println(solution("aabbaccc"));
		System.out.println(solution("ababcdcdababcdcd"));
		System.out.println(solution("abcabcdede"));
		System.out.println(solution("abcabcabcabcdededededede"));
		System.out.println(solution("xababcdcdababcdcd"));
	}
}