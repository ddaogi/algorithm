import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(in.readLine());
		int[] idxArr = new int[10001];
		for (int i = 0; i < N; i++) {
			idxArr[Integer.parseInt(in.readLine())]++;
		}
		for (int i = 1; i < 10001; i++) {
			for (int j = 0; j < idxArr[i]; j++)
				sb.append(i).append("\n");
		}
		System.out.println(sb);
	}
}
