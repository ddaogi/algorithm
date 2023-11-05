import java.lang.Math;
class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean flag = false;
        for(int i =1;i<=Math.sqrt(n);i++){
            if(n % i ==0)
                answer++;
            if(i == Math.sqrt(n))
                flag = true;
        }
        if(flag){
            answer = answer+answer-1;
        }
        else
            answer=answer+answer;
        return answer;
    }
}