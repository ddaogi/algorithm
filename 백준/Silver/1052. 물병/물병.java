import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int []power = new int[31];
		
		
		int maxPower=0;
		for(int i =0;i<31;i++){
			power[i] = (int)Math.pow(2, i);
			if(power[i] >N) {
				maxPower = i;
				break;
			}
		}
		int sum = 0;
		for(int i=0;i<K-1;i++) {
			for(int j =maxPower ; j>0;j--) {
				if(sum + power[j] <N) {
					sum+= power[j];
					break;
				}
			}
		}
		for(int i =0;i<31;i++) {
			if(sum + power[i]>=N) {
				System.out.println(sum+power[i]-N);
				break;
			}
		}
		
		
		sc.close();
	}
}

		