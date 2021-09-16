package PROM_42583;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

public class Solution {

    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        // 1. 마지막 트럭을 제외한 모든 트럭이 다리를 통과하는 데 걸린 시간.
    	int answer = 0;
    	// 2. 현재 다리의 트럭 무게 총합, 트럭들의 무게를 참조 할 변수
    	int temp_weight = 0, idx = 0;
    	// 3. 다리, 큐로 구현
    	Queue<Integer> queue = new LinkedList<Integer>();
    	
    	// 4. 마지막 트럭을 제외한 모든 트럭을 통과시키기 위한 무한 반복
    	while(true) {
    		// 5. 마지막 트럭이 다리에 올라갔을 때, 벗어난다.
    		if(idx==truck_weights.length) {
    			break;
    		}
    	}
    	
        return answer;
    }
	
	public static void main(String[] args) {
		int[] truck_weights = {7,4,5,6};
		System.out.println(solution(2,10,truck_weights));
	}
}