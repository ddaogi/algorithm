
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		int[] dp = new int[N];
		for(int i =0;i<N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			dp[i] = 1;
		}

		
		
		for(int i =0;i<N;i++) {
			int big = arr[i];
			int count =0;
			for(int j =i+1;j<N;j++) {
				if(arr[i] < arr[j]) {
					dp[j] = Math.max(dp[j],dp[i]+1);
				}
			}
			
		}
		int max = 0;
		for(int i : dp)
			max = Math.max(max, i);
		if(N ==0)
			System.out.println(0);
		else
			System.out.println(max);
	}
}
