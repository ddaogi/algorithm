import java.util.*;
class Solution {
    public static String[] answers = {};
    public static int answerIdx = 0;
    public String[] solution(String[][] tickets) {
        
        
        boolean[] visited=  new boolean[tickets.length];
       
        answers = new String[tickets.length+100000];
        for(int i =0;i<tickets.length;i++){
            if(tickets[i][0].equals("ICN")){
                Arrays.fill(visited,false);
                visited[i] = true;
                dfs(tickets,visited,i,1,"ICN");
            }
        }
        String[] fit=new String[answerIdx];
        for(int i =0;i<answerIdx;i++){
            fit[i] = answers[i];
        }
        // System.out.println(Arrays.toString(fit));
        Arrays.sort(fit);
        // System.out.println(fit[0]);
        String[] answer = fit[0].split(" ");
        return answer;
        // String[] answer = {};
        // return answer;
    }
    public void dfs(String[][] tickets, boolean[] visited,int idx,int depth,String ret){
        visited[idx] = true;
        String arrive = tickets[idx][1];
        
        if(depth == tickets.length){
            // System.out.println(ret+" "+ arrive);
            answers[answerIdx] = ret+ " " + arrive;
            answerIdx++;
            return;
        }
            
        
        for(int i=0;i<visited.length;i++){
            if(tickets[i][0].equals(arrive) && !visited[i]){
                dfs(tickets,visited,i,depth+1,ret+" " +arrive);
                visited[i] = false;
            }
                
        }
        return;
       
    }
}