import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        int sum=0;
        
        
        
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(int i:scoville){
            q.add(i);
        }
        while(q.size()>1 & q.element()<K){
            int a =q.poll();
            int b= q.poll();
            int mix = a+(2*b);
            q.add(mix);
            answer++;
        }

        
        for(int i:scoville)
            sum+=i;

         if(q.size() <= 1 && q.peek() < K)
            answer = -1;
        
        return answer;
    }
}