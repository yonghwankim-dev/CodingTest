package BOJ_17298;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void test() {
		int n = 1000000;
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = 1;
		}
		System.out.println(Main.solution2(arr, n));
	}
	
	@Disabled
	@Test
	void test2() {
		int n = 5;
		int[] seq = {9,2,7,8,5};
		
		System.out.println(Main.solution(seq, n));
	}
}
