package PROM_17682;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

	public static String[] splitDartResult(String dartResult)
	{
		String regex = "(\\d{1,2}[SDT]+[\\*#]*)";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(dartResult);
		
		String[] splitedDartResult = new String[3];
		int i=0;
		while(matcher.find())
		{
			splitedDartResult[i] = matcher.group();
			i++;
		}
		return splitedDartResult;
	}
		
	public static String[] splitOneResult(String oneResult)
	{
		String regex = "(\\d{1,2})([SDT]+)([\\*#])*";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(oneResult);
		
		String[] splitedOneReslut = new String[3];
	
		int i=1;
		if(matcher.find())
		{
			while(i<=3)
			{
				splitedOneReslut[i-1] = matcher.group(i);
				i++;
			}
		}
		
		return splitedOneReslut;		
	}
	
	public static int cal(String dartResult, int[] answer, int i)
	{
		String[] splitedOneResult = splitOneResult(dartResult);
		int score = Integer.parseInt(splitedOneResult[0]);		// 점수
		String area = splitedOneResult[1];						// 영역
		String opt = splitedOneResult[2]!=null ? splitedOneResult[2] : "";	// 옵션
		
		
		// 영역 점수 계산
		if(area.equals("D"))
		{
			score = (int) Math.pow(score, 2);
		}
		else if(area.equals("T"))
		{
			score = (int) Math.pow(score, 3);
		}
		
		if(opt.equals("*"))
		{
			score *=2;
			if(i>0)
			{
				answer[i-1] *= 2;
			}
		}
		else if(opt.equals("#"))
		{
			score *= (-1);
		}
		
		
		return score;
	}
	
	public static int getSum(int[] arr)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		return sum;
	}
	
	public static int solution(String dartResult) {
		
		
		String[] splitedDartResult = splitDartResult(dartResult);
		int[] answer = new int[3];
		
		for(int i=0;i<3;i++)
		{	
			answer[i] = cal(splitedDartResult[i], answer, i);
		}
	
		return getSum(answer);
    }
}