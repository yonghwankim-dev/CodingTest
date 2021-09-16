package PROM_42888;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
public class Solution {
	

    public static String[] solution(String[] record) {
        
        
        List<String> chattLog = new ArrayList();
        HashMap<String, String> nickMap = new HashMap<String, String>();
        
        for(String r : record)
        {
        	String[] tokens = r.split(" ");
        	String cmd = tokens[0];
        	String userId = tokens[1];
        	String nick = "";
        	
        	if(!cmd.equals("Leave"))
        	{
        		nick = tokens[2];
        	}
        	
        	switch(cmd)
        	{
        	case "Enter":
        		nickMap.put(userId, nick);
        		chattLog.add(userId+"´ÔÀÌ µé¾î¿Ô½À´Ï´Ù.");
        		break;
        	case "Leave":
        		chattLog.add(userId+"´ÔÀÌ ³ª°¬½À´Ï´Ù.");
        		break;
        	case "Change":
        		nickMap.put(userId, nick);
        		break;
        	}
        }
        
        String[] answer = new String[chattLog.size()];
        
        // userId -> nickname change
        int idx = 0;
        for(String s : chattLog)
        {
        	int endOfId = s.indexOf("´Ô");
        	String userId = s.substring(0, endOfId);
        	
        	answer[idx++] = s.replace(userId, nickMap.get(userId));
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		
		String[] result = solution(record);
		System.out.println(Arrays.asList(result).toString());
	}
}