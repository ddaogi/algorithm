import java.io.*;
import java.util.StringTokenizer;
 
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int N, T;
        int time, interval, number;
        int min = 1000000000;
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        N = Integer.parseInt(st.nextToken());
        T = Integer.parseInt(st.nextToken());
 
        int i, j;
        for (i = 0; i < N; i++) { 
            s = br.readLine();
            st = new StringTokenizer(s);
            time = Integer.parseInt(st.nextToken());
            interval = Integer.parseInt(st.nextToken());
            number = Integer.parseInt(st.nextToken());
 
            if (time >= T && min > (time - T)) { 
                min = time - T; 
            }
            else{ 
                for(j=0;j<number;j++){ 
                    if(time >= T){ 
                        if(min > (time - T)) { 
                            min = time - T; 
                        }
                        break;
                    }
                    time += interval;
                }
            }
        }
 
        if(min == 1000000000) 
            System.out.print(-1);
        else
            System.out.print(min);
    }
}