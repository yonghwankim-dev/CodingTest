package BOJ_15649;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Main {
	
	public static void search(int n, int m, List<Integer> p, boolean[] chosen)
	{
		if(p.size()==m)
		{
			p.stream().forEach(item -> System.out.print(item + " "));
			System.out.println();
		}else {
			for(int i=1;i<=n; i++)
			{
				if(chosen[i])
				{
					continue;
				}
				chosen[i] = true;
				p.add(i);
 				
				search(n, m, p, chosen);
				
				chosen[i] = false;
				p.remove(p.size()-1);
			}
		}
	}
	
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		boolean[] chosen = new boolean[n+1];
		List<Integer> p = new ArrayList<Integer>();
		
		search(n, m, p, chosen);
		
	}
}
