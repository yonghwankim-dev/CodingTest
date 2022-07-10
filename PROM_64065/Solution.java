package PROM_64065;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        int len = s.length();
        String sub = s.substring(1, len-1);
        Map<Integer, Integer> counter = new HashMap<>();

        for(int i = 0; i < sub.length(); i++){
            if(Character.isDigit(sub.charAt(i))){
                int target = Character.valueOf(sub.charAt(i)) - 48;
                int cnt  = counter.getOrDefault(target, 1);
                counter.put(target, cnt+1);
            }
        }

        // 부분집합에서 가장 빈번히 나온 숫자의 내림차순





        return answer;
    }

    public static void main(String[] args){
        String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
        new Solution().solution(s);
    }
}
