package BOJ_2231;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void test() {
		for(int i=1;i<=1000;i++)
		{
			System.out.println("f("+i+")="+Main.solution(i));
		}
	}
	
	

}
