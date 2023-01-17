import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		
		PriorityQueue<Integer> absMinHeap = new PriorityQueue<Integer>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				if(Math.abs(o1) == Math.abs(o2))
					return Integer.compare(o1, o2);
				else
					return Integer.compare(Math.abs(o1),Math.abs(o2));
			}
		});
		
		for(int i =0; i<N;i++) {
			arr[i] = sc.nextInt();
			if(arr[i] != 0)
				absMinHeap.add(arr[i]);
			else
				if(absMinHeap.isEmpty()) 
					System.out.println(0);
				else 
					System.out.println(absMinHeap.poll());
		}
		
	}
}
