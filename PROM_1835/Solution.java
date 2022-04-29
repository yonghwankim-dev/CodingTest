package PROM_1835;

import java.util.HashMap;
import java.util.Map;

public class Solution{
	boolean[] chosen;
	int[] nums;
	Map<String, Integer> position; 
	int person;
	int answer;
	String[] data;
	static final String[] FRIENDS = {"", "A", "C", "F", "J", "M", "N", "R", "T"};

	public Solution() {
		
	}
	
	public Solution(boolean[] chosen, int[] nums, int person, String[] data) {
		this.chosen = chosen;
		this.nums = nums;
		this.person = person;
		this.answer = 0;
		this.position = new HashMap<String, Integer>();
		this.data = data;
		
		
		for(String friend : FRIENDS)
		{
			this.position.put(friend, 0);
		}
	}
	
	public void DFS(int level)
	{
		if(level == person)
		{
			for(String condition : data)
			{
				int p1 = position.get(String.valueOf(condition.charAt(0)));
				int p2 = position.get(String.valueOf(condition.charAt(2)));
				String r = String.valueOf(condition.charAt(3));
				int interval = Integer.parseInt(String.valueOf(condition.charAt(4)));
				
				if(!isSatisfiedInterval(p1, p2, r, interval))
				{
					return;
				}
			}
			answer++;
		}
		else
		{
			for(int i = 1; i <= person; i++)
			{
				if(!chosen[i])
				{
					position.put(FRIENDS[level+1], nums[i]);
					chosen[i] = true;
					DFS(level + 1);
					chosen[i] = false;
				}
			}
		}
	}
	
	private boolean isSatisfiedInterval(int p1, int p2, String r, int interval)
	{
		if(r.equals("="))
		{
			// |a가 있는 위치 - b가 있는 위치| = interval + 1
			return Math.abs(p1-p2) == interval + 1;
		}
		else if(r.equals(">"))
		{
			// |a가 있는 위치 - b가 있는 위치| > interval + 1
			return Math.abs(p1-p2) > interval + 1;
		}
		else
		{
			// |a가 있는 위치 - b가 있는 위치| < interval + 1
			return Math.abs(p1-p2) < interval + 1;
		}
	}
	
    public int solution(int n, String[] data) {
		int person = 8;
		boolean[] chosen = new boolean[person+1];
		int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        Solution solution = new Solution(chosen, nums, person, data);
        
        solution.DFS(0);
    	
        return solution.answer;
    }
}