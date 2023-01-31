import java.util.*;
import java.io.*;


public class Main {

    static int N,r,c;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());


        int size = (int) Math.pow(2,N);
        System.out.println(recur(0,0,size));

    }

    public static int recur(int nr, int nc, int size) {

        if (size == 1) {
            return 0;
        }

        if (r < nr + size / 2 && c < nc + size / 2)
            return recur(nr, nc, size / 2);

        else if (r < nr + size / 2 && c < nc + size)
            return recur(nr, nc + size / 2, size / 2) + (int) Math.pow(size / 2, 2);

        else if (r < nr + size && c < nc + size / 2)
            return recur(nr + size / 2, nc, size / 2) + (int) Math.pow(size / 2, 2) * 2;

        else
            return recur(nr + size / 2, nc + size / 2, size / 2) + (int) Math.pow(size / 2, 2) * 3;

    }
}
