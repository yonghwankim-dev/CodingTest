package PROM_42885;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SolutionTest {

	@Test
	void test1() {
		Solution test = new Solution();
		
		assertEquals(3, test.solution(new int[] {70, 50, 80, 50}, 100));
		assertEquals(3, test.solution(new int[] {70, 80, 50}, 100));
		assertEquals(2, test.solution(new int[] {40, 40, 80}, 160));
		assertEquals(2, test.solution(new int[] {20, 50, 50, 80}, 100));
		assertEquals(5, test.solution(new int[] {40,50,60,70,80,90}, 100));
		assertEquals(2, test.solution(new int[] {40,40,40}, 100));
	}

}
