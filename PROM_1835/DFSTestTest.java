package PROM_1835;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.Assert;

class DFSTestTest {

	@Test
	void test() {
		int person = 8;
		boolean[] chosen = new boolean[person+1];
		int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8};
		String[] data = {"N~F=0", "R~T>2"};
		
        Solution solution = new Solution(chosen, nums, person, data);
        
        solution.DFS(0);
        
        Assert.assertEquals(solution.answer, 3648);
	}
	
	@Test
	void test2() {
		int person = 8;
		boolean[] chosen = new boolean[person+1];
		int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8};
		String[] data = {"M~C<2", "C~M>1"};
		
        Solution solution = new Solution(chosen, nums, person, data);
        
        solution.DFS(0);
        
        Assert.assertEquals(solution.answer, 0);
	}

}
