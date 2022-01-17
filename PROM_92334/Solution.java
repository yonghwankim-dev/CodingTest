package PROM_92334;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Solution {
    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        // step0 : 신고내역을 저장하기 위한 해시맵 초기화
        Map<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();	// 유저id가 신고한 내역
        Map<String, Integer> counter = new HashMap<String, Integer>();					// 유저id 신고받은 횟수
        
        Arrays.stream(id_list).forEach(id->{
        	map.put(id, new ArrayList<String>());
        	counter.put(id, 0);
        });
        
        // step1 : 유저id가 신고한 ID 저장
        String reporter = null;
        String target = null;
        for(int i=0;i<report.length;i++)
        {
        	String[] r = report[i].split(" ");
        	reporter = r[0];
        	target = r[1];
        	
        	// 신고자가 같은 유저를 여러번 수행하는 경우, 카운트하지 않음
        	if(!map.get(reporter).contains(target))
        	{
        		map.get(reporter).add(target);				// 신고내역 추가
        		counter.put(target, counter.get(target)+1);	// 신고횟수 누적
        	}
        }
        
        // step2 : 정지될 id 추출
        List<String> ban_id = new ArrayList<>(); 
        for(String id : counter.keySet())
        {
        	if(counter.get(id)>=k)
        	{
        		ban_id.add(id);
        	}
        }
        
        // step3 : 각각의 유저에게 보낼 메일 횟수세기
        for(int i=0;i<id_list.length;i++)
        {
        	List<String> temp = map.get(id_list[i]);
        	int count = 0;
        	for(String id : temp)
        	{
        		if(ban_id.contains(id))
        		{
        			count++;
        		}
        	}
        	answer[i] = count;
        }
        
        
        return answer;
    }
    
    public static void main(String[] args)
    {
    	String[] id_list = {"muzi", "frodo", "apeach", "neo"};
    	String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
    	
    	int[] answer = solution(id_list, report, 2);
    	System.out.println(Arrays.toString(answer));
    }
}
