import java.io.*;

public class Main {
    private static final String REGEX = "^[A-F]?A+F+C+[A-F]?$";

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (N-->0)
            sb.append(br.readLine().matches(REGEX)?"Infected!\n":"Good\n");
        System.out.print(sb);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}