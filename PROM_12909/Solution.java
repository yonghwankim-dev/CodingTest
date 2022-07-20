package PROM_12909;

import java.util.Stack;

class Solution {
	boolean solution(String s) {
		boolean answer = true;
		Stack<Character> stack = new Stack<>();

		for(char c : s.toCharArray()){
			if(c == '('){
				stack.add(c);
			}else{ // ')'
				if(stack.isEmpty()){
					return false;
				}
				stack.pop();
			}
		}

		if(stack.isEmpty()){
			answer = true;
		}else{
			answer = false;
		}
		return answer;
	}

	public static void main(String[] args){
		String s1 = "()()";
		String s2 = "(())()";
		String s3 = ")()(";
		String s4 = "(()(";

		System.out.println(new Solution().solution(s1));
		System.out.println(new Solution().solution(s2));
		System.out.println(new Solution().solution(s3));
		System.out.println(new Solution().solution(s4));
	}
}