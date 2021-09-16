package PROM_60057;



public class Solution {
	static StringBuilder sb = new StringBuilder();
	
	public static void capsulate(int p, int i, int count, String s)
	{
		while(p<s.length())
    	{
    		String sub;
    		
    		if(p+i>s.length()-1)
    		{
    			sub = s.substring(p);    			
    			sb.append(count==1 ? sub : count+sub);
    			break;
    		}
    		else
    		{
    			sub = s.substring(p, p+i);
    		}
    		
    		
    		int next_start = p+i;
    		int next_end = next_start+i;
    		String next_sub;
    		if(next_end>=s.length()+1)
    		{
    			next_sub = s.substring(next_start);
    		}
    		else
    		{
    			next_sub = s.substring(next_start, next_end);
    		}
    		
//    		System.out.println("next_sub : " + next_sub + " sb : " + sb);
    		
    		if(sub.equals(next_sub))
    		{
    			count++;
    		}
    		else
    		{
    			if(count>=2)
    			{
    				sb.append(count+sub);
    				count=1;
    			}
    			else
    			{
    				sb.append(sub);
    			}
    		}
    		p += i;
    	}
	}
	
    public static int solution(String s) {
        int answer = 0;
        
        int min_value = s.length();
        
        // i : 문자열을 자르는 개수 단위
        for(int i=1;i<=s.length()/2;i++)
        {
        	// p : 문자열 위치
        	int p = 0;
        	int count = 1;

        	capsulate(p, i, count, s);
        	
        	
        	min_value = Math.min(min_value, sb.length());
//        	System.out.println("capsulate result : " + sb + " min_value : " + min_value);
        	sb = new StringBuilder();
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