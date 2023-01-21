import java.util.*;
public class Main {
 
	static int N;
	static int M;
	static int max = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		boolean[] visited = new boolean[N];
		int[] arr = new int[N];
		for(int i =0;i<N;i++) {
			
			arr[i] = sc.nextInt();
		}
		
		combi(arr,visited,0,N,3);
		
		System.out.println(max);
		
	}
	public static void combi(int[] arr , boolean[] visited, int start, int n, int r) {
		
		if(r==0) {
			sum(arr,visited,n);
			return;
		}
		
		for(int i = start;i<n;i++) {
			visited[i] = true;
			combi(arr,visited,i+1,n,r-1);
			visited[i] = false;
		}
	}
	public static void sum(int[] arr, boolean[] visited,int n ) {
		int ret=0;
		for(int i =0;i<arr.length;i++) {
			if(visited[i])
				ret+=arr[i];
		}
		if(ret<=M & ret>max)
			max=ret;
	}
}
