import java.util.*;
import java.io.*;

public class Main {
	static int count = 0;
	static int[] arr;
	static int n, s;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		s = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		dfs(0,0);
		System.out.println(count);
	}

	public static void dfs(int idx, int sum) {
		if (idx == n)
			return;
		if( sum+ arr[idx] == s)
			count++;
		dfs(idx+1,sum);
		dfs(idx+1, sum+arr[idx]);

	}

}
