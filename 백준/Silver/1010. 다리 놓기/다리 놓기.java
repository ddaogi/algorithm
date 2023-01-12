import java.util.*;

public class Main {
	public static void main(String[] args) {
	
		
		int[][] dp = new int[31][31];
		
		for(int i=1;i<=30;i++) {
			dp[i][1] = i;
		}
		for(int j =2; j<=30;j++) {
			for(int k =2;k<=30;k++){
				dp[j][k] = dp[j-1][k-1] + dp[j-1][k];
			}
		}
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			System.out.println(dp[M][N]);
		}
			
		
	}
}
