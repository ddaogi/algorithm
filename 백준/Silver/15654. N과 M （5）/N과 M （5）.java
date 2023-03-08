import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	static int n, m;
	static boolean[] visited;
	static int[] nums;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken()); //자연수의 개수
		m = Integer.parseInt(st.nextToken()); //수열의 길이
		st=new StringTokenizer(br.readLine());
		nums = new int[n];
		for(int i =0;i<n;i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(nums);
//		System.out.println(Arrays.toString(nums));
		visited = new boolean[n];
		
		for(int i =0;i<n;i++) {
			dfs(1,i,"");
			Arrays.fill(visited, false);
		}
		
		
		
	}
	
	public static void dfs(int depth, int cur, String str) {
		visited[cur] = true;
		str= str+" "+nums[cur];
		if(depth == m) {
//			StringBuilder sb = new StringBuilder();
//			for(int i =0;i<n;i++) {
//				if(visited[i])
//					
//					sb.append(nums[i]).append(" ");
//			}
//			System.out.println(sb)
			System.out.println(str.substring(1));
			return;
		}
		
		for(int i =0;i<n;i++) {
			if(!visited[i]) {
				dfs(depth+1, i,str);
				visited[i]= false;
			}
				
		}
			
	}
	

}