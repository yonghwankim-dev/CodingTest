package BOJ_10610;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;



public class Main {
	

	/* 
	 * 3의 배수 판정법 : 각 자리의 합이 3의 배수
	 * 30의 배수 판정법 : 3의 배수이면서 일의 자리가 0인수
	 * 
	 * 즉, 30의 배수 판정법은 각 자리의 합이 3의 배수이고 일의 자리가 0인수이면 30의 배수이다.
	 * */
	public static String solution(List<Integer> numbers)
	{
		Collections.sort(numbers, Collections.reverseOrder());
		int sum = numbers.stream().mapToInt(Integer::intValue).sum();
		
		if(sum%3==0 && numbers.get(numbers.size()-1)==0)
		{
			return numbers.stream().map(String::valueOf).collect(Collectors.joining());
		}
		else
		{
			return "-1";
		}
		
	}
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> numbers = Arrays.asList(br.readLine().split(""))
								.stream()
								.map(Integer::parseInt)
								.collect(Collectors.toList());
		
		System.out.println(solution(numbers));
	}
}
