
import java.util.*;
import java.io.*;
public class Main {
	static int blueCount = 0;
	static int whiteCount =0;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N+1][N+1];
		for(int i =1;i<=N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j =1;j<=N;j++) {
				arr[i][j]= Integer.parseInt(st.nextToken());
			}
		}
		recur(arr,1,1,N);
		System.out.println(whiteCount);
		System.out.println(blueCount);
	}
	public static void recur(int[][] arr,int startI,int startJ, int n ) {
		if(n==1) {
			if(arr[startI][startJ] == 1)
				blueCount++;
			else if(arr[startI][startJ] == 0)
				whiteCount++;
			return;
			
		}
			
		boolean isBlue = true;
		boolean isWhite = true;
		for(int i=startI;i<(startI+n);i++) {
			
			for(int j =startJ;j<(startJ+n);j++) {
			
				if(arr[i][j] == 0) {
					isBlue = false;
				}			
				if(arr[i][j] ==1)
					isWhite= false;
			}
		}
		
		if(isBlue)
			blueCount++;
		else if(isWhite)
			whiteCount++;
		else {
			recur(arr,startI,    startJ,    n/2);
			recur(arr,startI,    startJ+n/2,n/2);
			recur(arr,startI+n/2,startJ+n/2,n/2);
			recur(arr,startI+n/2,startJ,    n/2);
		}
		
		
	}



}
