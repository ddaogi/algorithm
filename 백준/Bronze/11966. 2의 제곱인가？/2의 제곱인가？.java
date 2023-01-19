import java.util.*;

public class Main {
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int answer = 0;
		for(int i=0;i<=30;i++) {
			if(Math.pow(2, i) == N) {
				answer = 1;
				break;
			}
		}
		System.out.println(answer);
		
				
	
	
	}
	
	
}
