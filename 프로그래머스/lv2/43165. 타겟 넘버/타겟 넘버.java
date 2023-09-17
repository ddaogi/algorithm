class Solution {
    static int result =0;
    public static int solution(int[] numbers, int target) {
        dfs(0,target,0,numbers);
        return result;
    }

    public static void dfs(int sum, int target, int depth, int[] numbers){
        
        if(depth == numbers.length){
            if(sum == target){
                result++;
           
            }
             return;
        }
            
            
       
        
        dfs(sum-numbers[depth],target, depth+1,numbers);
        dfs(sum+numbers[depth],target, depth+1,numbers);
    }
}