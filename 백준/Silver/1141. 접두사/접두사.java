import java.util.*;
import java.io.*;
public class Main{

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        

        int n= Integer.parseInt(br.readLine());
        ArrayList<String> list = new ArrayList<>();

        for(int i = 0; i<n;i++)
        {
            String s = br.readLine();
            list.add(s);
        }

        Collections.sort(list, new Comparator<String>(){
            public int compare(String s1, String s2){
                    return s1.length()-s2.length();
            }
        });

        int cnt=0;
        for(int idx1 = 0; idx1<n;idx1++)
        {
            boolean check = false;
            for(int idx2 = idx1+1;idx2<n;idx2++){
                String m = list.get(idx1);
                String s = list.get(idx2);

                if(s.startsWith(m)){
                    check = true;
                    break;
                }
            }

            if(!check){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}