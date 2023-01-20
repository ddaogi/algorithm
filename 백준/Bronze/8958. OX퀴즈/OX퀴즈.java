import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		for(int i =0;i<N;i++) {
			String str = sc.nextLine();
			int count =1;
			int sum = 0;
			for(int j =0;j<str.length();j++) {
				if(str.charAt(j) == 'O') {
					sum += count;
					count++;
				}
				else
					count = 1;
					
			}
			System.out.println(sum);
		}
			
		
			
		
	}
	
	
}
