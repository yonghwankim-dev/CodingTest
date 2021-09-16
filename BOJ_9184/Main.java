package BOJ_9184;
/**
 * 동적 계획법 솔루션
 * step1 점화식 찾기 (동적계획법의 핵심은 반복되는 계산을 줄이는 것이기 때문에 대부분 점화식으로 표현 가능)
 * step2 점화식에서 반복되는 수식 확인하기
 * step3 점화식을 재귀식으로 전환, 반복되는 수식은 메모리에 저장하기
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int[][][] arr = new int[21][21][21];
	public static int w(int a, int b, int c)
	{
		if(a>=0 && a<=20 && b>=0 && b<=20 && c>=0 && c<=20)
		{
			if(arr[a][b][c]!=0)
			{
				return arr[a][b][c];
			}
		}
		
		if(a<=0 || b<=0 || c<=0)
		{
			return 1;
		}
		
		// a,b,c 중 하나가 20보다 크면 a,b,c 전부 20으로 고정됨
		if(a>20 || b>20 || c>20)
		{	
			return arr[20][20][20] = w(20,20,20);
		}
		
		if(a<b && b<c)
		{
			return arr[a][b][c] = w(a,b,c-1) + w(a,b-1,c-1) - w(a,b-1,c);
		}
		
		return arr[a][b][c] = w(a-1,b,c) + w(a-1,b-1,c) + w(a-1,b,c-1) - w(a-1,b-1,c-1);
	}
	
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true)
		{
			String str[] = br.readLine().split(" ");
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			int c = Integer.parseInt(str[2]);
			
			if(a==-1 && b==-1 && c==-1)
			{
				break;
			}
			
			int answer = w(a, b, c);
			System.out.printf("w(%d, %d, %d) = %d\n", a, b, c, answer);
		}
		
		
		
	}
}
