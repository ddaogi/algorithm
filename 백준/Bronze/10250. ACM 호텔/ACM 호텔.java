import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int k = Integer.parseInt(br.readLine());

		for (int i = 0; i < k; i++) {
			String str = br.readLine();
			String[] s = str.split(" ");
			int H = Integer.parseInt(s[0]);
			int W = Integer.parseInt(s[1]);
			int N = Integer.parseInt(s[2]);
			
			if( N%H == 0)
				System.out.println((H*100) + (N/H));
			else
				System.out.println(((N%H)*100)+((N/H)+1));

		}

	}
	
}
