
import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st1= new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st1.nextToken());
		int M = Integer.parseInt(st1.nextToken());
		int [][] graph = new int[N+1][N+1];
		for(int i =0;i<M;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			graph[a][b] = 1;
			graph[b][a] = 1;
		}
		int count =0;
		
		boolean[] vis = new boolean[N+1];
		for(int i =1; i<=N;i++) {
			if(!vis[i]) {
				dfs(graph,vis,i);
				count++;
			}
		}
		System.out.println(count);
		

	}
	public static void dfs(int[][] graph, boolean[] vis,int num) {
		if(vis[num]) return;
		vis[num] = true;
		for(int i =1;i<vis.length;i++) {
			if(graph[num][i] == 1)
				dfs(graph,vis,i);
		}
		
				
	}

}
