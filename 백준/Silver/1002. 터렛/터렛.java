import java.util.*;
import java.io.*;


public class Main {
   public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T--> 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int [] arr = new int[6];
            for(int i =0;i<6;i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            int x1 = arr[0];
            int x2 = arr[3];
            int y1 = arr[1];
            int y2 = arr[4];
            int r1 = arr[2];
            int r2 = arr[5];
            int distance = (x2-x1)*(x2-x1) + (y2-y1)*(y2-y1);
            int rValue = (r1+r2)*(r1+r2);

            if(x2==x1 && y1==y2 && r1==r2)
                System.out.println(-1);
            else if (distance == rValue || (r1-r2)*(r1-r2) == distance)
                System.out.println(1);
            else if ((x2==x1 && y1==y2) || distance > rValue || (r1-r2)*(r1-r2)>distance)
                System.out.println(0);
            else
                System.out.println(2);




        }


    }


}
