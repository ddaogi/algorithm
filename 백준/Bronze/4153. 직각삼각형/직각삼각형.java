import java.util.*;
import java.io.*;
public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		
		while(true) {
			String str = br.readLine();
			String[] strs = str.split(" ");
			
			int n1 = Integer.parseInt(strs[0]);
			int n2 = Integer.parseInt(strs[1]);
			int n3 = Integer.parseInt(strs[2]);
			
			if(n1+n2+n3 == 0) break;
			boolean isRight = false;
			n1 = n1*n1;
			n2 = n2*n2;
			n3=  n3*n3;
			if(n1 == n2+n3)
				isRight= true;
			else if (n2 == n1+n3)
				isRight = true;
			else if (n3 == n1+n2)
				isRight= true;
			if(isRight)
				System.out.println("right");
			else
				System.out.println("wrong");
		}
		
			
		
	}
}


