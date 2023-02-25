import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 지름길갯수
		int d = Integer.parseInt(st.nextToken()); // 목적지

		int[] dp = new int[d + 1];
		// 시작위치, 끝나는위치, 거리
		int[][] shortCuts = new int[n+1][3];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int distance = Integer.parseInt(st.nextToken());
			shortCuts[i][0] = start;
			shortCuts[i][1] = end;
			shortCuts[i][2] = distance;
		}
		shortCuts[n][1] = d+1;

		Arrays.sort(shortCuts, (o1, o2) -> {
			return Integer.compare(o1[1], o2[1]);

		});



		int arrIdx = 0;
		for (int i = 0; i <= d; i++) {
			if (shortCuts[arrIdx][1] == i) {
				int start = shortCuts[arrIdx][0];
				int di = shortCuts[arrIdx][2];
				if (dp[i] == 0) {
					if (dp[i - 1] + 1 > di+dp[start]) {
						dp[i] = di + dp[start];
					}
					else
						dp[i] = dp[i - 1] + 1;
				}
				
				//end값이 같은 지름길이 존재할경우
				else
					if(dp[start]+di < dp[i])
						dp[i] = dp[start]+di;
					
						
				arrIdx++;
				
								// end값이 같은 지름길이 또 존재할경우 진입
				if (shortCuts[arrIdx][1] == i) 
					i--;
				

			} else {
				if (i != 0)
					dp[i] = dp[i - 1] + 1;
			}

		}
//		for(int i=0;i<=d;i++) {
//			System.out.println(i+" "+dp[i]);
//		}
////		
		
		System.out.println(dp[d]);
	}
	
}
