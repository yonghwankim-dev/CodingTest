package CODEJAM.jam2021.qualification_round.p02_moon;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void test() {
		int x = 2;
		int y = 3;
		String s = "";
		List<String> list = new ArrayList<String>(); 
		for(int i=0; i<1000; i++)
		{
			if(i%2==0)
			{
				s += "J";
			}
			else if(i%3==0)
			{
				s += "?";
			}
			else
			{
				s += "C";
			}
		}
		System.out.println(Solution.solution(x, y, s, list));
	}

}
