package PROM_17677;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
	public int solution(String str1, String str2) {
		int answer = 0;
		// 공백, 숫자, 특수문자 제거
		str1 = str1.replaceAll("[^a-zA-Z]","").toUpperCase();
		str2 = str2.replaceAll("[^a-zA-Z]","").toUpperCase();

		// 문자열의 다중 집합 생성
		// EMC -> {EM, MC}
		List<String> first = new ArrayList<>();
		List<String> second = new ArrayList<>();

		for(int i = 0; i < str1.length()-1; i++){
			first.add(str1.substring(i,i+2));
		}
		for(int i = 0; i < str2.length()-1; i++){
			second.add(str2.substring(i,i+2));
		}

		Collections.sort(first);
		Collections.sort(second);


		// 두 다중집합의 교집합 생성
		List<String> intersection = new ArrayList<>();
		List<String> temp_first = new ArrayList<>(first);

		for(String s : second){
			if(temp_first.contains(s)){
				temp_first.remove(s);
				intersection.add(s);
			}
		}

		// 두 다중집합의 합집합 생성
		List<String> union = new ArrayList<>(first);
		temp_first         = new ArrayList<>(first);

		for(String s : second){
			if(!temp_first.contains(s)){ //포함하지 않은 경우
				union.add(s);
			}else{ // 포함한 경우
				temp_first.remove(s);
			}
		}

		System.out.println("str1   : " + str1);
		System.out.println("str2   : " + str2);
		System.out.println("first  : " + first);
		System.out.println("second : " + second);
		System.out.println("intersection : " + intersection);
		System.out.println("union : " + union);

		// J(str1, str2) 계산
		if(intersection.size() == 0 && union.size() == 0){
			answer = 65536;
		}else{
			answer = (int) Math.round(((double)intersection.size() / (double)union.size())*65536);
		}


		return answer;
	}
}