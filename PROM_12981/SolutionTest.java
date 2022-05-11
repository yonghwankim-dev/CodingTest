package PROM_12981;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	@Order(1)
	void test() {
		int n = 3;
		String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
		System.out.println(Arrays.toString(new Solution().solution(n, words)));
	}

	@Test
	@Order(2)
	void test2() {
		int n = 5;
		String[] words = {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};
		System.out.println(Arrays.toString(new Solution().solution(n, words)));
	}
	
	@Test
	@Order(3)
	void test3() {
		int n = 2;
		String[] words = {"hello", "one", "even", "never", "now", "world", "draw"};
		System.out.println(Arrays.toString(new Solution().solution(n, words)));
	}	
}
