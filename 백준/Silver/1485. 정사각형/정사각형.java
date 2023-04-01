import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int k = 0;
            long[] x = new long[4];
            long[] y = new long[4];
            for (int i = 0; i < 4; i++) {
                x[i] = sc.nextLong();
                y[i] = sc.nextLong();
            }
            long[] s = new long[6];
            for (int i = 0; i < 4; i++) {
                for (int j = i + 1; j < 4; j++) {
                    s[k] = (x[i] - x[j])*(x[i] - x[j]) + (y[i] - y[j])*(y[i] - y[j]);
                    k++;
                }
            }
            Arrays.sort(s);
            System.out.println(s[0] == s[1] && s[1] == s[2] && s[2] == s[3] && s[4] == s[5] ? "1" : "0");
        }
    }
}