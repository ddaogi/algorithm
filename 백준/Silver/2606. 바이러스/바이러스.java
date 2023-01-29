import java.util.*;
import java.io.*;

public class Main {

	static int[][] graph;
	static boolean[] visited;
	static int V;
	static int E;
	static int count;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		V = Integer.parseInt(br.readLine());
		E = Integer.parseInt(br.readLine());

		graph = new int[V + 1][V + 1];
		for (int i = 0; i < E; i++) {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str);
			int temp1 = Integer.parseInt(st.nextToken());
			int temp2 = Integer.parseInt(st.nextToken());
			graph[temp1][temp2] = 1;
			graph[temp2][temp1] = 1;
		}

		visited = new boolean[V + 1];
		count = 0;
		dfs(1);
		System.out.println(count-1);

	}

	public static void dfs(int v) {
		if (visited[v])
			return;
		visited[v] = true;
		count++;
		for (int i = 1; i <= V; i++) {
			if (graph[v][i] == 1 && !visited[i])
				dfs(i);
		}

	}

}
