
import java.io.*;
import java.util.*;

public class Main {

	static int[][] map;
	static int M;
	static int N;
	static int[] dx = { 0, 0, 1, -1 };
	static int[] dy = { -1, 1, 0, 0 };
	static int count = 0;
	static boolean[][] visited;
	static Queue <int[]> q = new LinkedList<>();
	static Queue <int[]> q2 = new LinkedList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		
		map = new int[N][M];
		for (int i = 0; i < N; i++) {
			str=br.readLine();
			st = new StringTokenizer(str);
			for (int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		
		visited = new boolean[N][M];
		
		
		int count = 0;
	
		for(int i =0;i<N;i++) {
			for(int j = 0;j<M;j++)
				if(map[i][j] == 1)
					q.add(new int[] {i,j});
		}
		
		do {
			while(!q2.isEmpty()) {
				q.add(q2.poll());
			}
		
			while(!q.isEmpty()) {
				int[] temp = q.poll();
				dfs(temp[0],temp[1]);
			}
			count++;
		}while(!q2.isEmpty());
		
		boolean unripen = false;
		for(int i =0;i<N;i++) {
			for(int j = 0;j<M;j++)
				if(map[i][j] == 0)
					unripen = true;
		}
		if(unripen)
			System.out.println(-1);
		else
			System.out.println(count-1);
		
		

	}

	public static boolean dfs(int x, int y) {
		boolean ret = false;
		for (int i = 0; i < 4; i++) {
			int nextX = x + dx[i];
			int nextY = y + dy[i];
			if (nextX >= 0 && nextX < N && nextY >= 0 && nextY < M ) {
				if (map[nextX][nextY] == 0) {
					map[nextX][nextY] = 1;
					q2.add(new int[] {nextX,nextY});
					ret = true;
				}
			}
		}
		return ret;

	}

	public static void print2d(int[][] a) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}
	
	public static int[][] arrCopy(int[][] a) {
	    int[][] b = new int[a.length][];
	    for (int i = 0; i < a.length; i++) {
	      b[i] = a[i].clone();
	    }
	    return b;
	  }

}
