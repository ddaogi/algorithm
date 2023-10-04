import java.util.*;
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] array = my_string.split("");
        String[] num = {"0","1","2","3","4","5","6","7","8","9"};
        for(String s : array){
            for(String s2: num){
                if(s.equals(s2)) answer+=Integer.parseInt(s);
            }
                
        }
        return answer;
    }
}