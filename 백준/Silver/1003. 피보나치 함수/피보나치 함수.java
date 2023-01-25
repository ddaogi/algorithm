import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		for(int i =0;i<k;i++) {
			int n = sc.nextInt();
			int [][] counts = new int[n][2];
			
			if( n== 0 )System.out.println("1 0");
			else if( n==1 ) System.out.println("0 1");
			else {
				counts[0][0] = 1;
				counts[0][1] = 0;
				counts[1][0] = 0;
				counts[1][1] = 1;
				for(int j = 2;j<n;j++) {
					counts[j][0] = counts[j-2][0] + counts[j-1][0];
					counts[j][1] = counts[j-2][1]+counts[j-1][1];
				}
				int zero = counts[n-1][0]+counts[n-2][0];
				int one = counts[n-1][1]+counts[n-2][1];
				
				System.out.println(zero+ " " +one);
			}
			
			
			
			
				
			
		}
		
	}
	
	
}
