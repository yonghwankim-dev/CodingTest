package PROM_77484;

import java.util.ArrayList;
import java.util.List;

public class Solution{
	
    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        List<Integer> lottos_ = new ArrayList<>();
        for(int lotto : lottos)
        	lottos_.add(lotto);
        
        List<Integer> win_nums_ = new ArrayList<>();
        for(int win_num : win_nums)
        	win_nums_.add(win_num);
        

        int win_count = 0;	// 당첨 개수
        int zero_count = 0;	// 공백 개수
        for(int lotto : lottos_)
        {
        	if(lotto==0)
        	{
        		zero_count++;
        		continue;
        	}
        	
        	if(win_nums_.contains(lotto))
        	{
        		win_count++;
        	}
        }
        int[] rank = {6,6,5,4,3,2,1};
        
        answer[0] = rank[win_count+zero_count];
        answer[1] = rank[win_count];
        
        return answer;
    }
    
	public static void main(String args[])
	{
		int[] lottos = {44,1,0,0,31,25};
		int[] win_nums = {31,10,45,1,6,19};
		int[] answer = solution(lottos, win_nums);
		System.out.printf("[%d, %d]",answer[0],answer[1]);
	}
}