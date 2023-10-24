import java.lang.Math;
class Solution {
    public int solution(int number, int limit, int power) {
        //약수를 먼저 구해
        int count = 0;
        int[] prime = new int[number+1];
        for(int i=1; i<=number;i++){
            count = 0;
            for(int j=1;j<=Math.sqrt(i);j++){
                if(i%j == 0){
                    if(Math.sqrt(i)==j) {
                        count++;
                    }
                    else{ 
                        count+=2;
                    }
                }                
            }
            if(count > limit) 
                count = power;
            prime[i-1] = count;
        }
        int answer = 0;
        for(int i : prime){
            answer+=i;
        }
        
        
        return answer;
    }
}