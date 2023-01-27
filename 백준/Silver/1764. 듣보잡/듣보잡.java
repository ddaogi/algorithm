import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		HashMap<String, Integer> map = new HashMap<>();
		sc.nextLine();
		

		int count = 0;
		String ans = "";
		for (int i = 0; i < N; i++) {
			map.put(sc.nextLine(), 1);
		}
		String[] arr = new String[M];
		for (int i = 0; i < M; i++) {
			arr[i] =  sc.nextLine();
		}
		Arrays.sort(arr);
		for(int i =0;i<M;i++) {
			if (map.containsKey(arr[i])) {
				count++;
				ans = ans + arr[i] + "\n";
			}
		}
		System.out.println(count);
		if(ans.length()>0)
			ans = ans.substring(0, ans.length() - 1);
		System.out.println(ans);
	}
}
