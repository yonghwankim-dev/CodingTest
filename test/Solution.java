package test;

public class Solution {
    public boolean isPrime(int n)
    {
        for(int i = 2; i <= Math.sqrt(n); i++)
        {
            if(n % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 1; i <= n; i++)
        {
            if(isPrime(i) && i != 1)
            {
                answer++;
            }
        }
        
        return answer;
    }
    
    public static void main(String[] args)
    {
    	new Solution().solution(10);
    }
}
