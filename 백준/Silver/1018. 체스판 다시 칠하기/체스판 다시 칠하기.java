import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		sc.nextLine();
		String[] arr = new String[N];

		for (int i = 0; i < N; i++)
			arr[i] = sc.nextLine();
		int min =Integer.MAX_VALUE;
		for (int i = 0; i < N - 7; i++) {
			for (int j = 0; j < M - 7; j++)
				min = Math.min(min,count(arr, i, j));
			
		}

		System.out.println(min);

	}

	public static int count(String[] str, int x, int y) {

		String BW = "BWBWBWBW";
		String WB = "WBWBWBWB";

		int cnt1 = 0;
		int cnt2 = 0;
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (i % 2 == 0) {
					if (str[i + x].charAt(y + j) != BW.charAt(j)) {
						cnt1++;
					}
					if (str[i + x].charAt(y + j) != WB.charAt(j)) {
						cnt2++;
					}
				}
				else {
					if (str[i + x].charAt(y + j) != WB.charAt(j)) {
						cnt1++;
					}
					if (str[i + x].charAt(y + j) != BW.charAt(j)) {
						cnt2++;
					}
				}
					
			}

		}
		return Math.min(cnt1, cnt2);
	}
}
