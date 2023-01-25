import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int k = Integer.parseInt(br.readLine());
		String [][] arr = new String[k][];
		for (int i = 0; i < k; i++) {
			String str = br.readLine();
			String[] s = str.split(" ");
			arr[i] = s;
		}
		for(int i =1;i<=200;i++) {
			for(int j =0;j<arr.length;j++) {
				if(Integer.parseInt(arr[j][0])==i)
					System.out.println(arr[j][0]+" "+arr[j][1]);
			}
		}

	}
	
}
