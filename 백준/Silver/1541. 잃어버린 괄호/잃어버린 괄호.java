import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		int result = 0;
		
		int num = 0;
		Boolean minusOn = false;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(Character.isDigit(ch)) {
				num = num*10+Integer.parseInt(""+ch);
			}
			else if(ch == '-') {
				if(minusOn) {
					result -= num;
				}
				else {
					result += num;
				}
					
				
				minusOn = true;
				num =0;
			}
			else if(ch == '+')
			{
				if(minusOn) {
					result -= num;
					
				}
				else
					result+= num;
				num =0;
			}
		}
		if(minusOn)
			result -= num;
		else
			result+=num;
		
		System.out.println(result);
	}

}


