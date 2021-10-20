package BOJ_11053;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDateTime;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class MainTest {	

	@Test
	void test1() {
		int n = 100000;
		int[] arr = new int[n+1];
		int[] d = new int[n+1];
		for(int i=1;i<=n;i++)
		{
			arr[i] = i;
		}
		
		System.out.println(Main.solution(n, arr,d));
		
	}
	
	@Test
	void test2() {
		int n = 100000;
		int[] arr = new int[n+1];
		int[] d = new int[n+1];	
		for(int i=1;i<=n;i++)
		{
			arr[i] = i;
		}
		
		System.out.println(Main.solution2(n, arr,d));		
	}	

}
