package PROM_68935;

import java.util.ArrayList;
import java.util.List;

/**
 * step1 n을 3으로 나누어 n의 3진수를 구함
 * step2 n의 3진수를 반전
 * step3 반전한 3진수를 10진수로 변환
 * @author qkdlf
 *
 */
public class Solution {
	public static int solution(int n)
	{
		//step1 3진수 구하기 및 n의 3진수 반전 수행
		int n_ = n;
		List<Integer> list = new ArrayList<>();
		
		while(n_>0)
		{
			list.add(n_%3);
			n_ /= 3;
		}
		
		int answer = 0;
		for(int i=list.size()-1, k=0;i>=0;i--,k++)
		{
			answer += (list.get(i)*Math.pow(3, k));
		}
	
		return answer;
	}
	
	// 다른 사람 풀이
    public static int solution2(int n) {
        String a = "";

        while(n > 0){
            a = (n % 3) + a;
            n /= 3;
        }
        a = new StringBuilder(a).reverse().toString();

        return Integer.parseInt(a,3);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution(45);
		
	}

}

/* 다른 사람 풀이
class Solution {

}
*/