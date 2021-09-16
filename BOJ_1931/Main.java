package BOJ_1931;
/**
 * step1 ȸ���� ����ð��� �������� �������� ����
 * step2 ù��° ȸ�Ǵ� ī��Ʈ�ϰ� ����ȸ�� ������ ù��° ȸ�Ǹ� ����
 * step3 �ι�° ȸ�Ǻ����� ���۽ð��� ����ȸ�� �ð� ���̿� �������� �ʰ� �ι�° ȸ�Ǻ����� ���۽ð��� ����ȸ�Ǻ�Ÿ ���ų� ũ�� ī��Ʈ��
 * 
 * ���� Ʋ�ȴµ� ȸ���� ���۽ð��� ������ �ð��� ���� ��츦 ����ؾߺ� �ҰͰ���
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
			// ù��° ȸ���ΰ��
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
