import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		HashMap <String,Integer> nameKey = new HashMap<>();
		HashMap <Integer,String> numKey = new HashMap<>();
		for(int i =1;i<=N;i++) {
			str = br.readLine();
			nameKey.put(str, i);
			numKey.put(i, str);			
		}
		
		for(int i =0;i<M;i++) {
			str = br.readLine();
			try {
				int num = Integer.parseInt(str);
				System.out.println(numKey.get(num));
			}catch(NumberFormatException e) {
				System.out.println(nameKey.get(str));
			}
		}
	}
	
}
