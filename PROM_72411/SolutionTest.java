package PROM_72411;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void test1() {
		String[] orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
		int[] course = {2, 3, 4};
		System.out.println(Arrays.toString(new Solution().solution(orders, course)));
	}
	
	@Test
	void test2() {
		String[] orders = {"ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"};
		int[] course = {2,3,5};
		System.out.println(Arrays.toString(new Solution().solution(orders, course)));
	}
	
	@Test
	void test3() {
		String[] orders = {"XYZ", "XWY", "WXA"};
		int[] course = {2,3,4};
		System.out.println(Arrays.toString(new Solution().solution(orders, course)));
	}
}
