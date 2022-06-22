package PROM_42747;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void test() {
		int[] citations = {3,0,6,1,5};

		int answer=  new Solution().solution(citations);
		assertEquals(3, answer);
	}

	@Test
	void test2() {
		int[] citations = {31, 66};
		assertEquals(2, new Solution().solution(citations));
	}
}
