
import java.util.*;
class Solution {
    
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[computers.length];
        int count =0;
        for(int i =0;i<visited.length;i++){
            if(!visited[i]){
                dfs(computers,visited,i);
                count++;        
            }
                
        }
        System.out.println(Arrays.toString(visited));
        return count;
    }
    
    public void dfs(int[][] computers, boolean[] visited, int current){
        visited[current] = true;
        for(int i =0;i<computers[current].length;i++){
            if(!visited[i] && computers[current][i] == 1)
                dfs(computers,visited,i);
        }
      
        
    }
}