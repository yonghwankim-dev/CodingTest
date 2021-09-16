package BOJ_10816;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Main {
	
	public static String solution(List<Integer> my_cards, List<Integer> cards)
	{
		StringBuilder sb = new StringBuilder();
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int card : my_cards)
		{
			// hashmap에 card가 포함되어 있지 않은 경우 1로 초기화
			if(!map.containsKey(card))
			{
				map.put(card, 1);
			}
			else // 포함되어 있는 경우 1 누적
			{
				map.put(card, map.get(card)+1);
			}
		}
		
		// cards 리스트의 각각의 정수에 대한 카운트 값 저장
		for(int card : cards)
		{
			if(map.containsKey(card))
			{
				sb.append(map.get(card) + " ");
			}
			else
			{
				sb.append(0 + " ");
			}
		}
		
		return sb.toString().trim();
	}
	
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		List<Integer> my_cards = Arrays.asList(br.readLine().split(" ")).stream().map(Integer::parseInt).collect(Collectors.toList());
		int m = Integer.parseInt(br.readLine());
		List<Integer> cards = Arrays.asList(br.readLine().split(" ")).stream().map(Integer::parseInt).collect(Collectors.toList());
		
		System.out.println(solution(my_cards, cards));
		
	}
}
