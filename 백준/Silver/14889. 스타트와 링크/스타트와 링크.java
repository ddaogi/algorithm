import java.util.*;

public class Main {
	static int N;
	static boolean visited[] ;
	static int score[][];
	static int ans = Integer.MAX_VALUE;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		score = new int[N+1][N+1];
		visited = new boolean[N+1];
		
		for(int i =1;i<=N;i++) {
			for(int j=1;j<=N;j++) {
				score[i][j] = sc.nextInt();
			}
		}
		
		DFS(1,0);
		
		System.out.println(ans);
		
	
		
	}
	public static void DFS(int depth, int n) {
		
		if(n== N/2) {
			int teamStart = 0;
			int teamLink = 0;
			for(int i=1;i<=N;i++) {
				for(int j=1;j<=N;j++) {
					if(visited[i] & visited[j]) teamStart += score[i][j];
					if(!visited[i] && !visited[j]) teamLink += score[i][j];
				}			
			}
			ans = Math.min(Math.abs(teamStart-teamLink), ans);
			return;
		}
		for(int i = depth;i<=N;i++) {
			if(!visited[i]) {
				visited[i]= true;
				DFS(i+1,n+1);
				visited[i]= false;
			}
		}
	}
}

