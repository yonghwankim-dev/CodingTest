package PROM_42576;

import java.util.ArrayList;
import java.util.Arrays;
public class Solution {
	public static String solution(String[] participant, String[] completion) {
        String answer = "";
        ArrayList<String> parti = new ArrayList<String>(Arrays.asList(participant));
        ArrayList<String> comple = new ArrayList<String>(Arrays.asList(completion));
        
        parti.removeAll(comple);
        
        
        
        
        return answer;
    }
	
	public static void main(String[] args) {
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		
		System.out.println(solution(participant, completion));
	}
}