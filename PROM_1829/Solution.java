package PROM_1829;


public class Solution{
	
	static int[][] dirs = {{-1,0},{1,0},{0,-1},{0,1}};	// UP DOWN LEFT RIGHT
	static int M,N;
	static boolean[][] visited;
	
    public static int[] solution(int m, int n, int[][] picture) {
    	
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;
        M = m;
        N = n;
        visited = new boolean[m][n];
     
        for(int i=0;i<m;i++)
        {
        	for(int j=0;j<n;j++)
        	{
        		if(!visited[i][j] &&
        				picture[i][j]!=0)
        		{
        			numberOfArea++;
            		int count = dfs(picture, i, j, picture[i][j]);
                    maxSizeOfOneArea = Math.max(count, maxSizeOfOneArea);
        		}
        	}
        }
        
        
        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }
    
    public static int dfs(int[][] picture, int cur_x, int cur_y, int value)
    {
    	int count = 1;
    	visited[cur_x][cur_y] = true;
    	
    	for(int i=0;i<4;i++)
    	{
    		int nX = cur_x + dirs[i][0];
    		int nY = cur_y + dirs[i][1];
    		
    		if(!inInside(nX, nY) || visited[nX][nY]
    				|| picture[nX][nY]!=value)
    		{
    			continue;
    		}
    		
    		count += dfs(picture, nX, nY, value);
    	}
    	return count;
    }

    // ¹üÀ§°¡ ¹þ¾î³µ´ÂÁö °Ë»ç
    public static boolean inInside(int nx, int ny)
    {
    	return (nx>=0 && nx<M) && (ny>=0 && ny<N);
    }
    
	public static void main(String args[])
	{
		int m = 6;
		int n = 4;
		
		int[][] picture = {
				{1,1,1,0},
				{1,1,1,0},
				{0,0,0,1},
				{0,0,0,1},
				{0,0,0,1},
				{0,0,0,1}
		};
		int[] result = solution(m, n, picture);
		System.out.println(result[0]);
		System.out.println(result[1]);
	}
}