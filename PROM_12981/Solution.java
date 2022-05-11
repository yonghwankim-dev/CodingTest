package PROM_12981;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class Solution {
	
	public boolean isOverlap(List<String> submit_words, List<String> list) {
		if(submit_words.contains(list.get(list.size()-1))) {
			return true;
		}
		return false;
	}
	
	public boolean isWrong(String lastWord, String word) {
		
		if(lastWord.charAt(lastWord.length() - 1) != word.charAt(0)) {
			return true;
		}
		return false;
	}
	
    public int[] solution(int n, String[] words) {
    	int[] answer = new int[2];
    	
    	// key : 사람번호, value : 한 사람이 말한 단어 리스트
    	Map<Integer, List<String>> map = new HashMap<>();
    	// 끝말잇기 게임에서 말한 단어 리스트
    	List<String> submit_words = new ArrayList<String>();
    	
    	// map 초기화
    	IntStream.range(1, n + 1).forEach((i)->{
    		map.put(i, new ArrayList<>());
    	});
    	
    	for(int i = 0; i < words.length; i++)
    	{
    		int p_turn = (i % n) + 1;	// 게임에 참가한 사람번호(차례)
    		int turn = (i / n) + 1;		// 게임이 진행된 차례
    		List<String> list = map.get(p_turn); // p_turn번 사람의 단어 리스트 참조
    		
    		list.add(words[i]);	// 단어 리스트에 단어 추가
    		
    		if(submit_words.size() == 0) {
    			submit_words.add(words[0]);
    		}
    		else {
    			// 현재까지 제출된 단어중에서 중복된게 있는지 검사
    			// 끝말잇기 규칙을 만족하지 않는지 검사
    			if(isOverlap(submit_words, list)
        				|| isWrong(submit_words.get(submit_words.size()-1), words[i])
        		){
        			answer[0] = p_turn;	// 가장 먼저 탈락하는 사람의 번호
        			answer[1] = turn;	// 가장 먼저 탈락하는 사람이 몇번째 차례인지 저장
        			break;
        		}
        		else
        		{
        			submit_words.add(words[i]);
        		}
    		}   		
    	}
        return answer;
    }
    
}