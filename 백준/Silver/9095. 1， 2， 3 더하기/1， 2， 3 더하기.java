
import java.util.*;
import java.io.*;
public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int[] arr = new int[12];
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 4;
		for(int i =4;i<=11;i++) {
			arr[i] = arr[i-1]+arr[i-2]+arr[i-3];
		}
		while(T-->0) {
			System.out.println(arr[Integer.parseInt(br.readLine())]);
			
			
		}
	}
	



}
