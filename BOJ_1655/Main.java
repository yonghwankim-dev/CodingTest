package BOJ_1655;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;


public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void print(PriorityQueue<Integer> pq)
	{
		
		Iterator<Integer> itor = pq.iterator();
		
		while(itor.hasNext())
		{
			System.out.print(itor.next() + " ");
		}
		System.out.println();
	}
	
	public static void solution(int n) throws NumberFormatException, IOException
	{
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for(int i=0; i<n; i++)
		{
			pq.add(Integer.parseInt(br.readLine()));
			int idx = 0;
			if(pq.size()%2==0)
			{
				idx = pq.size()/2-1;
			}
			else
			{
				idx = pq.size()/2;
			}
			System.out.println(pq.toArray()[idx]);
		}
		System.out.println(pq);
	}
	public static void main(String args[]) throws IOException
	{	
		int n = Integer.parseInt(br.readLine());
		
		solution(n);
		
	}
}
