import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int min = 1000000;
		int max = -1000000;
		for(int i =0;i<N;i++) {
			int temp = sc.nextInt();
			min = Math.min(min, temp);
			max= Math.max(max, temp);
		}
		System.out.println(min+" "+max);
			
		
			
		
	}
	
	
}
