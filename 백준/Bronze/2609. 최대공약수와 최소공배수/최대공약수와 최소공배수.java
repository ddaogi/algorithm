import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int gcd = 1;
		int min= Math.max(N, M);
		for(int i=min ; i>1;i--) {
			if(N%i ==0 && M%i==0) {
				gcd = i;
				break;	
			}
		}
		int lcm = N*M/gcd;
		
		System.out.println(gcd+"\n"+lcm);
		
		
	}
}
