import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        
        int[] answer = arr.length>1?new int[arr.length-1]:new int[arr.length];
        int[] sorted = arr.clone();
        Arrays.sort(sorted);
        int idx=0;
        if(sorted.length == 1)
            answer[0] = -1;
        else
            for(int i=0;i<arr.length;i++){
                if(sorted[0] == arr[i]){
                    sorted[0] = sorted[0]-1;
                }
                else
                    answer[idx++]=arr[i];
            }    
        return answer;
    }
}