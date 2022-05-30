package CSES_1069;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void test1() {
		String s = "AAAAAAAAAA";
		
		assertEquals(10, new Solution().solution(s));
	}

	@Test
	void test2() {
		String s = "ACACACACAC";
		
		assertEquals(1, new Solution().solution(s));
	}
	
	@Test
	void test3() {
		String s = "ACCGGGTTTT";
		
		assertEquals(4, new Solution().solution(s));
	}
}
