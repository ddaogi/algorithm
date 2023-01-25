import java.util.*;


public class Main {
	public static int[][] map;
	
	public static int[] dx = {0,0,1,-1};
	public static int[] dy = {1,-1,0,0};
	static int count;
	static int M;
	static int N;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i =0;i<T;i++) {
			M = sc.nextInt(); //가로
			N = sc.nextInt();
			int K = sc.nextInt(); // 배추개수
			count = 0;
			map = new int[M][N];
			for(int j=0;j<K;j++) {
				int a = sc.nextInt();
				int b= sc.nextInt();
				map[a][b] = 1;
			}
			for (int j = 0; j < M; j++) {
                for (int k = 0; k < N; k++) {
                    if (map[j][k] == 1) {
                        dfs(j, k);
                        count++;
                    }
                }
            }
			System.out.println(count);
			
		}
		
	}
	public static void dfs(int a, int b) {
		if(map[a][b] == 0)
			return;
		
		map[a][b] = 0;
		for(int i =0;i<4;i++) {
			int nextX = a+ dx[i];
			int nextY = b+ dy[i];
			if( nextX >= 0 && nextX<M && nextY >=0 && nextY<N) {
				dfs(nextX,nextY);
			}
				
		}
		
		
	}
	
}
