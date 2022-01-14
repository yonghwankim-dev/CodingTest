package PROM_81301;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Solution {
	
	enum numbers{
		zero(0),one(1),two(2),three(3),four(4),five(5),six(6),seven(7),eight(8),nine(9);

		private final int num;
		numbers(int num) {
			this.num = num;
		}
		public int getNum() {
			return num;
		}
	}
	
	public static int solution(String s)
	{
		
		for(numbers n : numbers.values())
		{
			s = s.replaceAll(n.toString(), n.getNum()+"");
		}
		
		return Integer.parseInt(s);
	}
	
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		System.out.println(solution(s));		
	}
}
