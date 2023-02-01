
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[][] RGB = new int[3][N];
			
		for(int i =0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j =0;j<3;j++){
				RGB[j][i] = Integer.parseInt(st.nextToken());
			}
		}
		for(int i =1;i<N;i++) {
			RGB[0][i]+= Math.min(RGB[1][i-1],RGB[2][i-1] );
			RGB[1][i]+= Math.min(RGB[0][i-1],RGB[2][i-1] );
			RGB[2][i]+= Math.min(RGB[0][i-1],RGB[1][i-1] );
		}
		System.out.println(Math.min(RGB[0][N-1], Math.min(RGB[1][N-1],RGB[2][N-1])));
		
		
		
	}
	
	
	
	
}

