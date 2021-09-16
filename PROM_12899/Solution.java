package PROM_12899;

/**
 * 124 나라의 숫자
 * 124 나라에서는 1, 2, 4 숫자만 사용한다.
 * 즉 3진수이다. 하지만 기존 3진수는 0,1,2를 사용하지만
 * 124 나라에서는 1, 2, 4만 사용한다.
 * 때문에 n이 3의 배수라면 기존에는 1을 올림 증가해야 하지만
 * 124 나라에서는 -1을 해야 한다.
 * 
 * nums의 순서가 4, 1, 2인 이유는
 * 124나라에서 1 -> 1, 2 -> 2 이다.
 * 1%3 = 1 -> 1번째 자리
 * 2%3 = 2 -> 2번째 자리
 * 위와 같이 인덱스 번호에 맞추어 배열하였다.
 * 
 * @author qkdlf
 *
 */

public class Solution{
	
    public static String solution(int n) {
        String answer = "";
        
        String[] nums = {"4","1","2"};
        
        while(n!=0)
        {
        	answer = nums[n%3] + answer;
        	n = n/3 - (n%3==0 ? 1 : 0);
        }
        return answer;
    }
    
	public static void main(String args[])
	{
		System.out.println(solution(6));
	}
}