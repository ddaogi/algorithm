import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		TreeSet<String> set = new TreeSet<>();
		for (int i = 0; i < N; i++) {
			set.add(sc.nextLine());
		}
		for (int i = 1; i < 51; i++)
		{
			for (String str : set) {
				if(str.length() == i)
					System.out.println(str);
			}
		}
	}
}
