import java.util.*;
class Solution {
   public static int [] solution(int[] numbers) {
        Stack<Integer> stack = new Stack<>();
        int[] ret = new int[numbers.length];
        
        
        for(int i=0 ; i<numbers.length ; i++) {
            //뒷수가 작을경우 스택에 인덱스를 넣어줌
            if(stack.isEmpty() || numbers[i]<numbers[i-1]) {
                stack.push(i);
                
            } else {
                
                // 현재 index i 에 있는 값보다 작은 값은 pop 
                while(!stack.isEmpty() && numbers[stack.peek()]<numbers[i]) {
                    ret[stack.pop()] = numbers[i];
                }
                stack.push(i);
            }
        }
        // 나머지는 -1
        while(!stack.isEmpty()) {
            ret[stack.pop()] = -1;
        }
        
        return ret;
    }
}