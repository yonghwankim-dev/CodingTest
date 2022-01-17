package PROM_92334;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void test() {
		String[] id_list = {"con", "ryan"};
		String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
		int k = 2;
		int[] answer = Solution.solution(id_list, report, k);
		System.out.println(Arrays.toString(answer));
	}

}
