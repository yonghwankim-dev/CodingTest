package PROM_17686;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public String[] solution(String[] files) {
        String[] answer = {};
        List<String> list = new ArrayList<>(Arrays.asList(files));

        System.out.println("normal : " + list);
        Comparator<String> head = new Comparator<String>() {
        	@Override
			public int compare(String o1, String o2) {
        		String s1 = o1.split("[0-9]")[0];
        		String s2 = o2.split("[0-9]")[0];
        		
				return s1.compareToIgnoreCase(s2);
			}
		};
		Comparator<String> number = new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				for(int i=0; i < o1.length(); i++) {
					
				}
				return 0;
			}
		};
		
		Collections.sort(list, head);
		
		System.out.println("head sort : " + list);
		return answer;
    }
    
}