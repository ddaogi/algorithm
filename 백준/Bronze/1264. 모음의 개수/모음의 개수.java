import java.util.*;

public class Main {


	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str = sc.nextLine();
		while(!str.equals("#")) {
			System.out.println(aeiou(str));
			str=sc.nextLine();
		}
		
		
		
	}

	// goal은 목표승률, min,max는 승리횟수 기준

	public static int aeiou(String str) {
		int count = 0;
		str =str.toLowerCase();
		for(int i =0;i<str.length();i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' ||str.charAt(i)=='o' ||str.charAt(i) == 'u') {
				count++;
			}
		
		}
		return count;
	
	}
	
}