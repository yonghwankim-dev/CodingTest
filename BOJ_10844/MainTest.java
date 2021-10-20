package BOJ_10844;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class MainTest {

	@Disabled
	@Test
	void test1() {
		
		for(int n=1;n<=100;n++)
		{
			Main.solution(n);
			System.out.println(Main.answer);
			
		}
		
	}

	@Test
	void nEquals100() {
		int n = 100;
		Main.solution(n);
		System.out.println(Main.answer%1000000000);
		
	}
}
