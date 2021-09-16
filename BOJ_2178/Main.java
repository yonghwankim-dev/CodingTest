package BOJ_2178;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Pair
{
	int y;
	int x;
	public Pair(int y, int x) {
		this.y = y;
		this.x = x;
	}
}

public class Main {
	public static int n;	// ����
	public static int m;	// ����
	
	static boolean[][] map = new boolean[100][100];	// true=���� �ִ� ��, false=���� ���� ��
	static int[][] check = new int[100][100];			// ������ ��
	static int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};	// up, down, left, right check;
	
	// input
	public static void In() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		n = Integer.parseInt(str[0]);
		m = Integer.parseInt(str[1]);
		
		for(int i=0;i<n;i++)
		{
			String road = br.readLine();
			for(int j=0;j<m;j++)
			{
				int r = Integer.parseInt(road.charAt(j)+"");
				if(r==1)
				{
					map[i][j] = true;
				}
			}
		}
	}
	
	public static void Out(int num)
	{
		System.out.println(num);
	}
	
	// check[y,x] is in or not
	public static boolean inInside(int a, int b)
	{
		return (a>=0 && a<n) && (b>=0 && b<m);
	}
	
	public static int bfs()
	{
		int cur_y = 0;
		int cur_x = 0;
		
		Queue<Pair> queue = new LinkedList<>();
		
		queue.add(new Pair(cur_y, cur_x));
		
		check[cur_y][cur_x] = 1;	// bfs�� �������鼭 ���°���� �� ���� �����ߴ���
		
		while(!queue.isEmpty())
		{
			cur_y = queue.peek().y;
			cur_x = queue.peek().x;
			queue.remove();
			
			if((cur_y==n-1) && (cur_x==m-1))	// ���� ����
			{
				break;
			}
			
			for(int i=0;i<4;i++) 
			{
				//up, down, left, right
				int next_y = cur_y + dirs[i][0];
				int next_x = cur_x + dirs[i][1];
				
				// next y, x�� �迭 ���ο� �ְ�, check 2���� �迭�� ��ϵ� �� ����, map�� true�� �Ǿ� �ִ� ���
				if(inInside(next_y, next_x) && check[next_y][next_x]==0 && map[next_y][next_x])
				{
					check[next_y][next_x] = check[cur_y][cur_x] + 1;	// ���� �湮�� + 1 = �����湮
					queue.add(new Pair(next_y, next_x));	// �湮�� ���� push
				}
			}
		}
		return check[n-1][m-1];
	}
	
	public static void main(String args[]) throws IOException
	{
		In();
		Out(bfs());
	}	
}
