
import java.util.*;
public class Main {
	static String[] arr ;
	static int N;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N =sc.nextInt();
		arr = new String[1+(N-1)*4];
		arr[0] = "*";
		
		star(arr,2);
		
		for(String s : arr)
			System.out.println(s);
				
	}	
	
	static void star(String[] str, int n) {
		if(n>N) return;
		int maxIdx = 1+(n-1)*4; 
		StringBuilder stars = new StringBuilder();
		StringBuilder blanks = new StringBuilder();
		for(int i = 0; i<maxIdx;i++) {
			stars.append("*");
		}
		for(int i=0; i< maxIdx-4;i++)
			blanks.append(" ");
		
		String[] prev = str.clone();
		
		for(int i =2;i<maxIdx-2;i++) {
			str[i] = "* " + prev[i-2] +" *";
		}
		
		str[0] = stars.toString();
		str[1] = "* "+ blanks.toString()+ " *";
		str[maxIdx-1] = stars.toString();
		str[maxIdx-2] = "* "+ blanks.toString() + " *";
		star(str,n+1);
	}
}
