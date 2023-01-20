import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i =0;i<N;i++) {
			StringBuilder sb = new StringBuilder();
			int M = sc.nextInt();
			String str = sc.nextLine();
			str= str.replace(" ","");
			for(int j=0;j<str.length();j++) {
				for(int k=0;k<M;k++) {
					sb.append(str.charAt(j));
				}
			}
			System.out.println(sb);
		}
			
		
			
		
	}
	
	
}
