import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		String str1 = sc.nextLine();

		if (N == 1)
			System.out.println(str1);

		else {
			for (int i = 1; i < N; i++) {
				String s = sc.nextLine();
				for (int j = 0; j < str1.length(); j++) {
					if (str1.charAt(j) != s.charAt(j)) {
						str1 = str1.substring(0, j) + '?' + str1.substring(j + 1);
					}
				}
			}
			System.out.println(str1);
		}
	}
}