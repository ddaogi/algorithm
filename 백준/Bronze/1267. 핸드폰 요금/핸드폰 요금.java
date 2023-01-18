import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ySum =0;
		int mSum =0;
		for(int i =0; i<n;i++) {
			int temp = sc.nextInt();
			ySum += (temp/30)*10+10;
			mSum += (temp/60)*15+15;
		}
		if(ySum== mSum){
			System.out.printf("Y M %d",ySum);
		}
		else if(ySum> mSum)
			System.out.printf("M %d",mSum);
		else
			System.out.printf("Y %d",ySum);

		sc.close();
	}
}
