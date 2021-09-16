package PROM_42747;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class Solution {
    public static int solution(int[] citations) {
        int answer = 0;
        
        // 0. int array => List<Integer> 변환
        List<Integer> list = Arrays.stream(citations).boxed().collect(Collectors.toList());
        
        // 1. 오름차순 정렬
        Collections.sort(list);
        
        for(int i=0;i<list.size();i++)
        {
        	int A = list.size()-i;	// h번 이상 인용된 논문이 h편 이상인 개수
        	int h = list.get(i);	// h번
        	
        	if(A>=h)
        	{
        		// 2. H-Index에 만족하는 경우
        		answer = A;
        	}
        }
        
        return answer;
    }
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//int[] citations = {3,0,6,1,5};
		int[] citations = {31,66};
		System.out.println(solution(citations));
	}
}
