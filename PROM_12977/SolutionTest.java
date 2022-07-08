package PROM_12977;


import org.junit.Test;

class SolutionTest {

	@Test
	void test() {
		int[] nums = new int[50];
		for(int i=0;i<nums.length;i++)
		{
			nums[i] = i+1;
		}
		System.out.println(Solution.solution(nums));
	}

}
