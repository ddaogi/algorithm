import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		int N = sc.nextInt();
		
		for(int i =0;i<N;i++)
			list.add(sc.nextInt());
		
		Collections.sort(list);
		for(Integer i : list) {
			sb.append(i+"\n");
		}
		System.out.println(sb);
	}
}

