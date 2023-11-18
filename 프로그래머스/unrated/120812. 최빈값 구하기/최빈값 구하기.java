import java.util.*;
class Solution {
    public int solution(int[] array) {
        int answer=0;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i: array){
            map.put(i,0);
        }
        for(int i : array){
            map.put(i,map.get(i)+1);
        }
        int most =0;
        for (int i : map.keySet()) {
            if(map.get(i)>most){
                most = map.get(i);
                answer = i;}
        }
        int count = 0;
             
        for (int i : map.keySet()) {
            if(most == map.get(i))
            {
                count++;
            }
            if(count == 2){
                answer = -1;
                break;
            } 
        }
       
        return answer;
    }
}