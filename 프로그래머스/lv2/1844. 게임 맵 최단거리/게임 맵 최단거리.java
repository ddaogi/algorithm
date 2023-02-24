import java.util.*;
class Solution {
    
    //출발위치 (0,0) , 도착위치 (n,m);
    static int n,m;    
    public int solution(int[][] maps) {
        
      
        n = maps.length; 
        m = maps[0].length; 
        
        boolean [][] visited = new boolean[n][m];
        
        
        int answer = bfs(maps,visited,0,0,1);
   
        return answer;
        
    }

    
    public int bfs(int[][] maps, boolean[][] visited,int x,int y, int depth){
       
        

        visited[x][y] = true;
        Queue<int[]> q= new LinkedList<>();
        
        
        
        q.add(new int[]{x,y,1});
        int count =1;
        while(!q.isEmpty()){
            int[] temp = q.poll();
            x = temp[0];
            y = temp[1];
            count = temp[2];
            if( x!=n-1 && maps[x+1][y] == 1 && !visited[x+1][y]){
                q.add(new int[]{x+1,y,count+1});
                visited[x+1][y]= true;
            }
                
            if( x!=0 && maps[x-1][y] == 1 && !visited[x-1][y]){
                q.add(new int[]{x-1,y,count+1});
                visited[x-1][y] = true;
            }
                
            if (y!=m-1 && maps[x][y+1] ==1  && !visited[x][y+1]){
                q.add(new int[] {x,y+1,count+1});
                visited[x][y+1]= true;
            }
                
            if (y!=0 && maps[x][y-1] == 1 && !visited[x][y-1] ){
                q.add(new int[]{x,y-1,count+1});
                visited[x][y-1] =true;
            }

            if(x==n-1 && y==m-1) return count;
        }
        
        return -1;
      
      
    }
    
}