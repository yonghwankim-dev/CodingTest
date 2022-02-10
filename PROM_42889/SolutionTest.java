package PROM_42889;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void test() {
		int N=5;
		int[] stages = new int[100];
		Random random = new Random();
		for(int i=0;i<stages.length;i++)
		{
			stages[i] = random.nextInt(102); 
		}
		System.out.println(Arrays.toString(Solution.solution(N, stages)));
	}
	


}
