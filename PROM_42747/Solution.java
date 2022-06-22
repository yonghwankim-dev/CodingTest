package PROM_42747;

import java.util.Arrays;

public class Solution {
	
	
    public int solution(int[] citations) {
        int hIndex = 0;
        int n      = citations.length; // 어떤 과학자의 발표한 논무 개수
        int h      = 0; 			   // 해당 논문보다 인용횟수가 크거나 같은 논문 편수
        
        // 1. 오름차순 정렬
        Arrays.sort(citations);
        
        // 2. 각각의 논문 인용 횟수 값이 h보다 크거나 같은지 검사
        for(int i = 0; i < n; i++) {
        	h = n - i; // 해당 요소(i)부터 마지막 요소까지의 요소 개수
        	if(citations[i] >= h) {
        		hIndex = h;
        		break;
        	}
        }
        
        return hIndex;
    }
}
