import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		String[] s = str.split(" ");
		int N = Integer.parseInt(s[0]);
		int K = Integer.parseInt(s[1]);
		
		int answer = fact(N) / (fact(K)*fact(N-K));
		System.out.println(answer);
	}
	static int fact(int N) {
		int ret = 1;
		for(int i =2;i<=N;i++)
			ret = ret*i;
		return ret;
	}
	
	
	
}
