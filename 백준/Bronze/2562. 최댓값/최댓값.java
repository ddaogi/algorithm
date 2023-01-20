import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min =0;
		int idx = 0;
		for(int i =0;i<9;i++) {
			int temp = sc.nextInt();
			if(temp>min) {
				min = temp;
				idx = i+1;
			}
		}
		System.out.println(min);
		System.out.println(idx);
	}
	
	
}
