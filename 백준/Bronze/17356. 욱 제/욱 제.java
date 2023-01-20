import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double M = (B-A)/400.0;
		
		double rate = 1/(1+Math.pow(10, M));
		
		System.out.println(rate);
		
	}
}
