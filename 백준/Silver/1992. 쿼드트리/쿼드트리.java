
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int [][] arr = new int [N][N];
		for(int i =0;i<N;i++) {
			String str = br.readLine();
			for(int j =0;j<N;j++) {
				arr[i][j] = Integer.parseInt(str.charAt(j)+"");
			}
		}
		
		
		String ans = recur(arr,0,0,N);
		System.out.println(ans);
		
	}
	public static String recur(int[][] arr, int rowIdx, int colIdx, int size) {
		Boolean allSame = true;
		
		int val = arr[rowIdx][colIdx];
		for(int i = rowIdx; i<rowIdx+size; i++) {		
			for(int j = colIdx; j<colIdx+size;j++) {
				if(arr[i][j] != val) {
					allSame = false;
					break;
				}
			}
			if(!allSame) break;
		}
		String s =	Integer.toString(val);
		String[] str = new String[4];
		if(allSame) 
			return s;
		else {
			str[0] = recur(arr,rowIdx,       colIdx		 ,size/2);
			str[2] = recur(arr,rowIdx+size/2,colIdx		 ,size/2);
			str[1]=  recur(arr,rowIdx,		colIdx+size/2,size/2);
			str[3] = recur(arr,rowIdx+size/2,colIdx+size/2,size/2);
			return "("+str[0]+str[1]+str[2]+str[3]+")";
		}
		

	}
}
