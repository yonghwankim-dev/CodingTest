package BOJ_17298;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;


public class Main {
		
	public static String solution(int[] seq, int n)
	{
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.push(0);	// seq[0]은 stack에서 꺼낼것이 없으므로 현재 인덱스를 stack에 push
		
		for(int i=1;i<n;i++)
		{
			// seq[i]와 seq[이전 인덱스] 비교 수행
			// seq[stack.peek()] < seq[i]
			// seq[i]은 seq[stack.peek()] 값보다 오른쪽에 있고, seq[stack.peek()]보다 크고, 가장 왼쪽에 있는 수가 됨
			// seq[stack.peek()] 값을 seq[i]으로 변경
			// stack이 비거나 seq[i]보다 크다면 반복문 종료
			while(!stack.isEmpty() && seq[stack.peek()]<seq[i])
			{
				seq[stack.pop()] = seq[i];
			}
			// stack이 비었거나 seq[i]보다 크므로 i를 stack에 저장
			stack.push(i);
		}
		
		// 위 반복문이 끝났음에도 불구하고 남은 stack의 인덱스 값들은 
		// 자신보다 큰 값이 없거나 비교할 요소가 없는 경우임
		// 스택에 남아있는 인덱스 위치의 값들은 -1로 저장
		while(!stack.isEmpty())
		{
			seq[stack.pop()] = -1;
		}

		// 출력문 저장
		Arrays.stream(seq)
				.forEach(item->sb.append(item+" "));
		String result = sb.toString().trim();
		
		return result;
	}
	
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		// 문자열(String) 배열에서 정수형 배열로 전환
		int[] seq = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		
		System.out.println(solution(seq, n));
		
	}
}
