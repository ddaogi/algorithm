import java.util.*;
import java.io.*;
public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		int N = Integer.parseInt(br.readLine());
		
		List <Integer> list = new ArrayList<>();
		String str = br.readLine();
		String[] arrN = str.split(" ");
		int[] arrIntN = new int [N];
		for(int i =0;i<N;i++) {
			arrIntN[i] = Integer.parseInt(arrN[i]);
		}
		
		int M = Integer.parseInt(br.readLine());
		String str2 = br.readLine();
		String[] arrM= str2.split(" ");
		int[] arrIntM = new int [M];
		for(int i =0;i<M;i++) {
			arrIntM[i] = Integer.parseInt(arrM[i]);
		}
		
		Arrays.sort(arrIntN);
		
		
		for(int i =0;i<M;i++) {
			if(binarySearch(arrIntN,arrIntM[i]))
				System.out.println(1);
			else
				System.out.println(0);
		}
	}
	public static boolean binarySearch(int[] arr, int n ) {
		int midIdx = arr.length/2;
		int minIdx = 0;
		int maxIdx = arr.length-1;
		
		while(maxIdx >= minIdx) {
			midIdx = (minIdx+maxIdx)/2;
			if(arr[midIdx] >n) {
				
				maxIdx = midIdx-1;
			}
			else if (arr[midIdx] < n ) {
				minIdx = midIdx+1;
			}
			else
				return true;
		}
		return false;
				
		
	}
}

