package PROM_42885;

import java.util.Arrays;

public class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;	// 보트 이동 횟수
        int left = 0;
        int right = people.length - 1;
        
        
        Arrays.sort(people);	// 오름차순 정렬
               
        while(left <= right) {
        	// left 사람과 right사람이 보트무게 제한에 들어오면
        	// left는 오른쪽으로 이동, right는 왼쪽으로 이동
        	// 제한을 넘기면 right만 왼쪽으로 이동
        	if(people[left] + people[right] <= limit) {	
        		left++;	
        	}
        	right--;
        	answer++;
        }
        return answer;
    }
    
    public static void main(String[] args) {
    	int[] people = {70, 80, 50, 50};
    	int limit = 100;
    	
    	System.out.println(new Solution().solution(people, limit));
    }
}