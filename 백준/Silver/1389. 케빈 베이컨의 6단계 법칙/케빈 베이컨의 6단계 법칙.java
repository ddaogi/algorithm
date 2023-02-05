import java.util.*;
import java.io.*;

public class Main{
	public static void main(String []args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int [][] graph = new int[N+1][N+1];
		for(int i=1;i<M+1;i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			graph[a][b] = 1;
			graph[b][a] = 1;
		}
		
		boolean [] visit = new boolean[N+1];
		
		for(int i =1;i<N+1;i++) {
			Arrays.fill(visit, false);
			dfs(i,i,graph,visit,N);
		}
		int min = Integer.MAX_VALUE;
		
		int ans = 0;
		
		
		for(int i=1;i<=N;i++) {
			int sum = 0;
			for(int j=1;j<=N;j++) {
				sum += graph[i][j];
			}
			if(sum < min) {
				min = sum;
				ans = i;
			}
		
			
		}
		
		System.out.println(ans);
		
	
		
	}
	static void dfs(int root,int currentV, int[][] graph , boolean[] visit,int N) {
		Queue <Integer> q = new LinkedList<>();
		q.add(currentV);
		visit[currentV] = true;
		
		while(!q.isEmpty()) {
			currentV=q.poll();
			for(int i = 1;i<=N;i++) {
				if(!visit[i] && graph[currentV][i] == 1) {
					q.add(i);
					visit[i] = true;
					graph[root][i] = graph[root][currentV] +1;

				}
			}
			
		}
		
		
		return;
	}
}