package CSES_1094;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void test() {
		long n = 5;
		int[] arr = {3, 2, 5, 1, 7};
		
		assertEquals(5, new Solution().solution(n, arr));
	}
	
	@Test
	void test2() {
		long n = 10;
		int[] arr = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
		
		assertEquals(0, new Solution().solution(n, arr));
	}
	
	@Test
	void test3() {
		long n = 10;
		int[] arr = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
		
		assertEquals(0, new Solution().solution(n, arr));
	}
}
