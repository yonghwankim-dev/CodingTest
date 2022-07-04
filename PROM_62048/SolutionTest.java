package PROM_62048;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void test() {
		long answer = new Solution().solution(8, 12);
		assertEquals(80, answer);
	}

}
