package PROM_17681;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void test() {
		int n = 100;
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		for(int i=0;i<n;i++)
		{
			arr1[i] = i+1;
			arr2[i] = i+3;
		}
		System.out.println(Arrays.toString(Solution.solution(n, arr1, arr2)));
	}

}
