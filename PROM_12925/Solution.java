package PROM_12925;

public class Solution{
	
	public static int solution(String s) {
        int answer = 0;
        
        if(s.charAt(0)=='-')
        {
        	answer = Integer.parseInt(s.substring(1)) * -1;
        }
        else
        {
        	answer = Integer.parseInt(s);
        }
        
        return answer;
    }
    
	public static void main(String args[])
	{
		System.out.println(solution("1234"));
	}
}