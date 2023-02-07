import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (tc-->0) {
            int n = Integer.parseInt(br.readLine());

            // input
            int[][] arr = new int[2][n+2];
            for (int i = 0; i < 2; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 2; j < n+2; j++) arr[i][j] = Integer.parseInt(st.nextToken());
            }

            // solution
            int answer = 0;
            for (int j = 2; j < n+2; j++) {
                arr[0][j] += Math.max(arr[1][j-2], arr[1][j-1]);
                arr[1][j] += Math.max(arr[0][j-2], arr[0][j-1]);
            }
            sb.append(Math.max(arr[0][n+1], arr[1][n+1])).append('\n');
        }
        System.out.println(sb);
    }
}
