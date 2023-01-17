import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		String[]  nums = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		
		String[] dict = new String[N-M+1];
		int idx = 0;
		for(int i = M ; i<=N;i++) {
			if(i <10)
				dict[idx++] = nums[i];
			else {
				dict[idx++] = nums[i/10]+" "+nums[i%10];
			}	
		}
		
		Arrays.sort(dict);
		int[] dictNums = new int[dict.length];
		
		Arrays.asList(nums).indexOf("zero");
		
		for(int i =0; i<dict.length;i++) {
			String[] splitted = dict[i].split(" ");
			if(splitted.length>1) {
				int ten = Arrays.asList(nums).indexOf(splitted[0]);
				int one = Arrays.asList(nums).indexOf(splitted[1]);
				
				dictNums[i] = ten*10 + one;
			}
			else
				dictNums[i] = Arrays.asList(nums).indexOf(splitted[0]);
				
			
			System.out.println(dictNums[i]);
		}
		
		
		
	}
	
	
}
