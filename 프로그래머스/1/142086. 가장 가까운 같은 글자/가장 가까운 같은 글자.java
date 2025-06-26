import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] arr = new int [s.length()];
        for(int i = s.length()-1;i>=0;i--){
            char origin_char = s.charAt(i);
            int count = 0;
            boolean found = false;
            for(int j = i-1; j >=0; j--){
                if(origin_char == s.charAt(j)){
                   arr[i] = count+1;
                    found= true;
                    break;    
                }else{
                    count++;
                }
            }
            if(!found){ arr[i] = -1;}

        
            
            
        }
        return arr;
    }
}