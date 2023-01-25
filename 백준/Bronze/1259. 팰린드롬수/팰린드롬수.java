
import java.io.*;
public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		while(true) {
			boolean isPalin = true;
			String str = br.readLine();
			int len = str.length();
			if(str.equals("0")) break;
	
			if(len == 1 ) {
				System.out.println("yes");
				continue;
			}
			for(int i =0; i<len/2;i++) {
				if(str.charAt(i) != (str.charAt(len-i-1))){
					isPalin = false;
					break;
				}
				
			}
			
			if(isPalin)
				System.out.println("yes");
			else
				System.out.println("no");
			
		}
		
	}
}

