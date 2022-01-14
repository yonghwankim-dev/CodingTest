package PROM_81301;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void test() {
		String[] strs = {"one4seveneight","23four5six7","2three45sixseven","123"};
		for(String s : strs)
		{
			System.out.println(Solution.solution(s));
		}
	}

}
