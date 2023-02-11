import java.util.*;
import java.io.*;
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String[] strArr= new String[N];

        int rowCount = 0;
        Stack <Character> stack = new Stack<>();
        for(int i =0;i<N;i++){
            strArr[i] = br.readLine();

            //rowCheck
            for(int j =0;j<strArr[i].length();j++){



                if(stack.empty()) {
                    if (strArr[i].charAt(j) == '-') {
                        rowCount++;
                    }
                }
                else{
                    char temp = stack.peek();
                    if(  temp == '|' && strArr[i].charAt(j) == '-')
                        rowCount++;
                }
                stack.add(strArr[i].charAt(j));
            }
            stack.clear();


        }
        int colCount = 0;
        for(int i =0;i<M;i++){  //M이 column갯수
            for(int j =0;j<N;j++){
                if (stack.empty()){
                    if (strArr[j].charAt(i) == '|') {
                        colCount++;
                    }
                }
                else{
                    char temp = stack.peek();
                    if(temp == '-' && strArr[j].charAt(i) == '|'){
                        colCount++;
                    }
                }
                stack.add(strArr[j].charAt(i));

            }
            stack.clear();
        }
        System.out.println(rowCount+colCount) ;
        //rowCheck


    }
}