package PROM_84512;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Solution {
	
	private static final String[] ALPAHABET = {"A", "E", "I", "O", "U"};
	private static final boolean[] include = new boolean[5];
	private static final List<String> list = new ArrayList<>();
	private static int n = 5;
	public static void recur(int k) {
		if(k == n) {
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < n; i++) {
				if(include[i]) {
					sb.append(ALPAHABET[i]);
				}
				System.out.println(sb.toString());
				return;
			}
		}
		include[k] = false;
		recur(k + 1);
		include[k] = true;
		recur(k + 1);
	}
	
    public int solution(String word) {
        int answer = 0;
        recur(0);
        
        return answer;
    }
    public static void main(String[] args) {
    	new Solution().solution(null);
    }
}
