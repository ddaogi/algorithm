import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        PriorityQueue <Integer> q = new PriorityQueue <>();
        int[] answer = new int[commands.length];
        for(int i =0;i<commands.length;i++)
        {
            int ii = commands[i][0];
            int jj= commands[i][1];
            int kk= commands[i][2];
            
            int idx=0;
            // 첫번째 세번째  == 인덱스 0 ,2
            int [] temp = new int[jj-ii+1];
            for(int j =ii-1;j<jj;j++)
            {
                temp[idx] = array[j];
                idx++;
            }
            
            Arrays.sort(temp);
            answer[i] = temp[kk-1];
        }
        
        
    
        
        return answer;
    }
}