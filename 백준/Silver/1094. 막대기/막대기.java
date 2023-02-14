import java.util.*;

public class Main {


	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int X = sc.nextInt();	
		
		int sum = 64;
		int w = 0;
			while (X > 0) {
				
				if (sum > X)
					sum /= 2;
				else {
					X -= sum;
					w++;
				}
			}
		System.out.println(w);
	}
	
}