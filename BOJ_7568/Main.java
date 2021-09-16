package BOJ_7568;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static class Person
	{
		int rank=1;
		int weight;	// 몸무게
		int height;	// 키
		
		Person(int weight, int height)
		{
			this.weight = weight;
			this.height = height;
		}

		@Override
		public String toString() {
			return "Person [rank=" + rank + ", weight=" + weight + ", height=" + height + "]";
		}
		
		
	}
	
	public static String solution(Person[] persons)
	{
		StringBuilder answer = new StringBuilder();
		for(int i=0;i<persons.length;i++)
		{
			for(int j=i+1;j<persons.length;j++)
			{
				if(persons[i].weight > persons[j].weight &&
						persons[i].height > persons[j].height)
				{
					persons[j].rank++;
				}else if(persons[i].weight < persons[j].weight &&
						persons[i].height < persons[j].height)
				{
					persons[i].rank++;
				}
			}
			answer.append(persons[i].rank + " ");
		}
		return answer.toString().trim();
	}
	
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		Person[] persons = new Person[n];
		
		for(int i=0;i<n;i++)
		{
			String str[] = br.readLine().split(" ");
			persons[i] = new Person(Integer.parseInt(str[0]),Integer.parseInt(str[1]));
		}
		System.out.println(solution(persons));
	}
}
