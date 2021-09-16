package PROM_312691;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void test1() {
		int[] weights = {50,82,75,120};
		String[] head2head = {"NLWL","WNLL","LWNW","WWLN"};
		System.out.println(Arrays.toString(Solution.solution(weights, head2head)));
	}
	@Test
	void test2() {
		int[] weights = {145,92,86};
		String[] head2head = {"NLW","WNL","LWN"};
		System.out.println(Arrays.toString(Solution.solution(weights, head2head)));
	}
	@Test
	void test3() {
		int[] weights = {60,70,60};
		String[] head2head = {"NNN","NNN","NNN"};
		System.out.println(Arrays.toString(Solution.solution(weights, head2head)));
	}
}
