package PROM_60057;

/**
 * ���α׷��ӽ� �ٸ� ��� Ǯ��
 * @author qkdlf
 *
 */
public class Solution2 {
	public int solution(String s)
	{
		int answer = 0;
		
		for(int i=1;i<=(s.length())+1;i++)
		{
			int result = getSplitedLength(s,i,1).length();
			answer = i==1 ? result : (answer>result ? result : answer);
		}
		return answer;
	}

	/**
	 * 
	 * @param s �߸��� ���ڿ�
	 * @param n �ڸ��� ���� ����
	 * @param repeat �ݺ��� Ƚ��
	 * @return
	 */
	public String getSplitedLength(String s, int n, int repeat) {
		// base case
		if(s.length()<n)
		{
			return s;
		}
		
		String result = "";
		String preString = s.substring(0,n);
		String postString = s.substring(n,s.length());
		
		// ����ġ -> ������� [�ݺ�Ƚ��+�ݺ�����] ����
		if(!postString.startsWith(preString))
		{
			if(repeat==1)
			{
				return result += preString + getSplitedLength(postString, n, 1);
			}
			return result += Integer.toString(repeat) + preString + getSplitedLength(postString, n, 1);
		}
		return result += getSplitedLength(postString, n, repeat+1);
	}
	
	
}
