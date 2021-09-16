package BOJ_1931;
/**
 * step1 회의의 종료시간을 기준으로 오름차순 정렬
 * step2 첫번째 회의는 카운트하고 이전회의 변수에 첫번째 회의를 저장
 * step3 두번째 회의부터의 시작시간이 이전회의 시간 사이에 존재하지 않고 두번째 회의부터의 시작시간이 이전회의보타 같거나 크면 카운트함
 * 
 * 현재 틀렸는데 회의의 시작시간과 끝나는 시간이 같은 경우를 고려해야봐 할것같음
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Main {
	
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int start, end;
		List<Conference> list = new ArrayList<>();
		
		for(int i=0;i<n;i++)
		{
			String[] str = br.readLine().split(" ");
			start = Integer.parseInt(str[0]);
			end = Integer.parseInt(str[1]);
			list.add(new Conference(start, end));
		}
		
		Comparator<Conference> comparator = new Comparator<Conference>() {
			
			@Override
			public int compare(Conference c1, Conference c2) {
				// TODO Auto-generated method stub
				return c1.end - c2.end;
			}
		};
		
		Comparator<Conference> comparator2 = new Comparator<Conference>() {
			
			@Override
			public int compare(Conference c1, Conference c2) {
				// TODO Auto-generated method stub
				return c1.start - c2.start;
			}
		};
		
		Collections.sort(list, comparator.thenComparing(comparator2));
		
		int answer = 0;
		Conference prev = null;
		
		for(Conference c : list)
		{
			// 첫번째 회의인경우
			if(prev==null)
			{
				answer++;
				prev = c;
			}
			else 
			{
				if(!(prev.start <= c.start && c.start < prev.end) && (c.start >= prev.end))
				{
					answer++;
					prev = c;
				}
			}

		}
		
		System.out.println(answer);

	}
}

class Conference
{
	int start;
	int end;
	
	public Conference() {
		// TODO Auto-generated constructor stub
	}
	public Conference(int start, int end)
	{
		this.start = start;
		this.end = end;
	}
	@Override
	public String toString() {
		return "Conference [start=" + start + ", end=" + end + "]";
	}
	
}
