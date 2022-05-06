package number_baseball;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class NumberBaseball {
	private List<Integer> answer;
	private int[] userInput;
	private int strike;
	private int ball;
	private int fourBall;
	private static final int N = 3;
		
	/**
	 * 컴퓨터는 1~9 사이의 중복되지 않는 N개의 수를 생성하고 저장함
	 */
	private void makeCom() {
		Random random = new Random();
		int val = 0;
		
		answer = new ArrayList<Integer>();
		
		// 중복되지 않는 1~9 사이의 수를 N개 저장
		while(answer.size() != N)
		{
			val = random.nextInt(9) + 1;
			if(!answer.contains(val))
			{
				answer.add(val);
			}
		}
	}
	
	/**
	 * 사용자에게 입력 안내 문구를 출력함
	 */
	private void printInputGuide() {
		System.out.print("숫자를 입력해주세요. 종료) 000 ex) ");
		IntStream.range(1, N+1).forEach((i)->{
			System.out.printf("%d", i);
		});
		System.out.printf(" : ");
	}
	
	/**
	 * 숫자 야구 정답을 출력함 
	 */
	private void printAnswer() {
		System.out.printf("숫자야구 정답 : ");
		answer.stream().forEach((num)->{
			System.out.printf("%d", num);
		});
		System.out.println();
	}
	
	/**
	 * 사용자로부터 숫자를 입력받음
	 * @throws IOException 입출력 오류
	 * @throws InputMismatchException 숫자가 아닌 값 입력
	 * @throws ArrayIndexOutOfBoundsException N개를 넘는 값 입력
	 */
	private void input(){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] nums;
		int i = 0;
		
		userInput = new int[N];
		
		while(true)
		{
			try {
				nums = br.readLine().toCharArray();
				for(char num : nums)
				{
					if(!Character.isDigit(num))
					{
						throw new InputMismatchException();
					}
					else
					{
						userInput[i++] = Integer.parseInt(String.valueOf(num));
					}
				}
				
				break;
				
			} catch (InputMismatchException | IOException e) {
				System.out.printf("입력이 잘못되었습니다.\n");
				printInputGuide();
				i = 0;				
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.printf("숫자를 %d개만 입력해주세요.\n", N);
				printInputGuide();
				i = 0;
			}
		}	
	}
	
	/**
	 * 사용자가 입력한 숫자와 정답을 비교
	 */
	private void compare() {
		strike = ball = fourBall = 0;
		
		for(int i = 0; i < N; i++){
			if(answer.get(i) == userInput[i]){
				strike++;
			}
			else if(answer.contains(userInput[i])){
				ball++;
			}
			else{
				fourBall++;
			}
		}
	}
	
	/**
	 * 비교 결과를 출력하고 정답인지 검사함 
	 * @return true : 정답, false : 정답아님
	 */
	private boolean checkResult() {
		boolean result = false;
		
		if(fourBall == N){
			System.out.printf("낫싱\n");
		}
		else if(strike == N){
			System.out.printf("%d 스트라이크\n", strike);
			result = true;
		}
		else{
			System.out.printf("%d 스트라이크 %d볼\n", strike, ball);
		}
		
		return result;
	}
	
	/**
	 * 사용자가 게임을 종료하는지 검사함
	 * @return true=게임종료, false=게임진행
	 */
	private boolean isExit() {
		if(userInput[0] == 0 && userInput[1] == 0 && userInput[2] == 0)
		{
			return true;
		}
		return false;	
	}
	
	/**
	 * 숫자 야구 게임 실행
	 */
	public void play(){
		makeCom();	// 컴퓨터가 새로운 숫자를 생성
		
		while(true) {
			printInputGuide();
			input();
			
			if(isExit()) {	// 게임 종료
				printAnswer();
				System.exit(0);
			}
			
			compare();
			
			if(checkResult()){
				System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
				break;
			}
		}
	}

	public static void main(String[] args) throws IOException
	{
		NumberBaseball game = new NumberBaseball();		

		while(true)
		{
			game.play();
		}		
	}
}
