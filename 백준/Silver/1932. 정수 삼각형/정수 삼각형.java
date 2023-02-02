
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int N = Integer.parseInt(br.readLine());
		int [][] tree = new int[N][N];
		for(int i =0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j =0;j<=i;j++) {
				tree[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int [][] sum = new int[N][N];
		sum[0][0] = tree[0][0];
		for(int i =1;i<N;i++) {
			for(int j =0;j<=i;j++) {
				if(j!=0)
					sum[i][j] = tree[i][j]+Math.max(sum[i-1][j],sum[i-1][j-1]);
				else
					sum[i][j] = tree[i][j] + sum[i-1][j];
			}
		}
		int max= sum[N-1][0];
		for(int i=1;i<N;i++) {
			if(sum[N-1][i]>max)
				max=sum[N-1][i];
		}
		System.out.println(max);
		
	}
}
