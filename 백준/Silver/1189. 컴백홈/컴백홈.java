import java.util.*;

public class Main {
	
	static int R,C,K;
	static char[][] map;
	static boolean[][]visited;
	static int answer=0;
	
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		R = sc.nextInt(); //vertex 갯수
		C = sc.nextInt(); // edge 갯수
	    K = sc.nextInt();
		sc.nextLine();
		map = new char[R][C];
		visited = new boolean[R][C];
	
		
		
		for(int i=0;i<R;i++) {
			String str = sc.nextLine();
			for(int j =0;j<str.length();j++) {
				map[i][j] = str.charAt(j);
			}			
		}
		
		//첫 출발 위치
		visited[R-1][0] = true;
		
		dfs(R-1, 0,1);
				
		System.out.println(answer);
	}	
	
	static void dfs (int r ,int c , int count) {
		if(r == 0 && c == C-1) {
			if(count == K)
				answer++;
		}
		for(int i=0;i<4;i++) {
			int nextR = r+dx[i];
			int nextC = c+dy[i];
			if(nextR < 0 || nextR>=R || nextC<0 || nextC>=C)
				continue;
			if(visited[nextR][nextC] == true || map[nextR][nextC] == 'T')
				continue;
			visited[nextR][nextC] = true;
			dfs(nextR,nextC,count+1);
			visited[nextR][nextC] = false;
			
		}
	}
	
}
