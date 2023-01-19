import java.util.*;

public class Main {
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] arrN = new int[N];
		
		for(int i =0;i<N;i++)
			arrN[i] = sc.nextInt();
		int M = sc.nextInt();
		
		int [] arr = new int [M];
		
		Arrays.sort(arrN);
		for(int i=0;i<M;i++)
			arr[i] = sc.nextInt();
		
		
		for(int i =0;i<M;i++){
			sb.append(binarySearch(arrN,arr[i])).append(" ");	
		}
		System.out.println(sb);
		
				
	
	
	}
	public static int binarySearch(int[] arr, int search) {
		int low = 0 ;
		int high = arr.length-1;
		int mid = 0;
		while( low <= high) {
			mid = (low+high)/2;
			if(arr[mid] == search)
				return 1;
			if(arr[mid]< search)
				low = mid+1;
			else
				high = mid -1;
		}
		return 0;		
	}
	
}
