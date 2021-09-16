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
	public static int n;	// 가로
	public static int m;	// 세로
	
	static boolean[][] map = new boolean[100][100];	// true=갈수 있는 길, false=갈수 없는 길
	static int[][] check = new int[100][100];			// 지나온 길
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
		
		check[cur_y][cur_x] = 1;	// bfs가 지나가면서 몇번째만에 그 점에 접근했는지
		
		while(!queue.isEmpty())
		{
			cur_y = queue.peek().y;
			cur_x = queue.peek().x;
			queue.remove();
			
			if((cur_y==n-1) && (cur_x==m-1))	// 도착 지점
			{
				break;
			}
			
			for(int i=0;i<4;i++) 
			{
				//up, down, left, right
				int next_y = cur_y + dirs[i][0];
				int next_x = cur_x + dirs[i][1];
				
				// next y, x가 배열 내부에 있고, check 2차원 배열에 기록된 적 없고, map에 true로 되어 있는 경우
				if(inInside(next_y, next_x) && check[next_y][next_x]==0 && map[next_y][next_x])
				{
					check[next_y][next_x] = check[cur_y][cur_x] + 1;	// 이전 방문값 + 1 = 다음방문
					queue.add(new Pair(next_y, next_x));	// 방문한 곳을 push
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
