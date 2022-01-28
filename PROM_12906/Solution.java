package PROM_12906;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution{
	
	public static int[] solution(int []arr) {
		int n = arr.length;
		List<Integer> list = new ArrayList<Integer>();
		list.add(arr[0]);
        for(int i=1;i<n;i++)
        {
        	if(!(arr[i-1]==arr[i]))
        	{
        		list.add(arr[i]);
        	}
        }
        
        
		return list.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String args[])
    {
    	int[] arr = {1,1,3,3,0,1,1};
    	int[] arr2 = {4,4,4,3,3};
    	System.out.println(Arrays.toString(solution(arr2)));
    }
    
	
}