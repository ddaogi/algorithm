import java.util.*;
class Solution {
    public int solution(String begin, String target, String[] words) {
        boolean[]visited = new boolean[words.length];
        
        
        return bfs(begin,target,words,visited);
    }
    
    static class Node{
        public String str;
        public int depth;
        Node(String str,int depth){
            this.str = str;
            this.depth = depth;
        }
    }
        
    
    public int bfs(String begin, String target, String[]words, boolean[]visited){
       
        Queue<Node> q = new LinkedList<>();
           
        
        q.add(new Node(begin,0));
        
        while(!q.isEmpty()){
            
            Node cur = q.poll();    
                      
            if(cur.str.equals(target))
                return cur.depth;
            for(int i =0;i<visited.length;i++){
                if( (diffCount(cur.str, words[i]) ==1 )&& !visited[i] ){
                    q.add(new Node(words[i],cur.depth+1));    
                    visited[i] = true;
                }
            }
            
        }
       
        return 0;
        
    }
    
    public int diffCount(String a, String b){
        int count= 0;
        for(int i =0;i<a.length();i++)
            if(a.charAt(i) != b.charAt(i))
                count++;
        
        return count;
    
    }
    
}