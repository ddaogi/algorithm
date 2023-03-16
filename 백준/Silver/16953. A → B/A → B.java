import java.io.*;
import java.util.*;

public class Main {
	

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		String strA = st.nextToken();
		String strB = st.nextToken();
		
		int a = Integer.parseInt(strA);
		int b = Integer.parseInt(strB);
		int cnt = 0;
		while(true) {
			int mod = b%10;
			if(b%2 == 1 && mod !=1) {
				cnt = -2;
				break;
			}
			if(b%2==1) {
				b = b/10;
			}
			else {
				b = b/2;
			}
			cnt++;
			
			if(b==a) break;
			if(a>b || b==0) {
				cnt = -2;
				break;
			}
			
		}
		
		System.out.println(cnt+1);
	}
	

}

