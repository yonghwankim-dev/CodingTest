package PROM_12973;

import java.util.Stack;

public class Solution{
	
    public static int solution(String s)
    {
    	Stack<Character> stack = new Stack<Character>();
    	
    	for(int i=0;i<s.length();i++)
    	{
    		if(stack.size()==0)
    		{
    			stack.add(s.charAt(i));
    		}
    		else if(stack.peek().equals(s.charAt(i)))
    		{
    			stack.pop();
    		}
    		else
    		{
    			stack.add(s.charAt(i));
    		}
    	}
    	if(stack.size()==0)
    	{
    		return 1;
    	}
    	else
    	{
    		return 0;
    	}

    }
    
	public static void main(String args[])
	{
		System.out.println(solution("baabaa"));
		System.out.println(solution("cdcd"));
	}
}