import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int K = sc.nextInt();
		int N = sc.nextInt();
		int[] nums = new int[K];
		for (int i = 0; i < K; i++) {
			nums[i] = sc.nextInt();
		}
		Arrays.sort(nums);
		
		long high = nums[K-1];
		long low = 1;
		long mid = 0;
		
		while(low<=high) {
			long count = 0;
			mid = (low+high)/2;
			for(int i =0;i<nums.length;i++)
				count+= nums[i]/mid;
			if (count >= N) 
				low = mid+1;
			else if(count < N)
				high = mid-1;

		}
		System.out.println(high);
		sc.close();

	}
}
