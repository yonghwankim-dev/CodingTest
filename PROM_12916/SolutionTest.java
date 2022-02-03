package PROM_12916;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void test() {
		StringBuilder sb = new StringBuilder();
    	for(long i=0;i<100000000;i++)
    	{
    		sb.append("p");
    	}
    	System.out.println(Solution.solution(sb.toString()));
	}

}
