package BOJ_1181;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Main {
	
	public static class Lang{
		private String word;
		private int len;
		
		public Lang()
		{
			
		}
		
		public Lang(String word, int len) {
			this.word = word;
			this.len = len;
		}
		
		public String getWord() {
			return word;
		}
		public void setWord(String word) {
			this.word = word;
		}
		public int getLen() {
			return len;
		}
		public void setLen(int len) {
			this.len = len;
		}
		@Override
		public String toString() {
			return "lang [word=" + word + ", len=" + len + "]";
		}	
	}
	
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		List<Lang> list = new ArrayList<>();
		List<String> answer = new ArrayList<String>();
		
		// 단어 입력
		for(int i=0;i<tc;i++)
		{
			String word = br.readLine();
			
			list.add(new Lang(word,word.length()));
		}
		
		// 단어 길이 오름차순 -> 단어 오름차순 정렬
		list.sort(Comparator.comparing(Lang::getLen).thenComparing(Lang::getWord));
		
		// 출력 리스트에 중복되는 단어 제외하고 저장
		for(Lang l : list)
		{
			String w = l.getWord();
			if(answer.contains(w))
			{
				continue;
			}
			else
			{
				answer.add(w);
			}
		}
		
		// 출력
		for(String s : answer)
		{
			System.out.print(s + " ");
		}

		
		
	}
}
