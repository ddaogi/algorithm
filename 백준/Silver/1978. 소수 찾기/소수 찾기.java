import java.util.*;
public class Main {
 
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int N = sc.nextInt();
		int count =0;
		for(int i=0;i<N;i++) {
			if(isPrime(sc.nextInt()))
				count++;
		}
		System.out.println(count);
		
		
	}
	public static boolean isPrime(int k) {
		if(k==1) return false;
		for(int i =2;i<=Math.sqrt(k);i++)
			if(k%i==0) {
				return false;

			}
		return true;
	}
}
