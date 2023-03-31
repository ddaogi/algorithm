import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static final int INF = 10000000;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int v = Integer.parseInt(br.readLine());
        int e = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int [][]map =new int[v+1][v+1];
        
        for(int a[] : map) {
        	Arrays.fill(a, INF);
        }
        for(int i =0;i<e;i++) {
        	st = new StringTokenizer(br.readLine());
        	int a = Integer.parseInt(st.nextToken());
        	int b = Integer.parseInt(st.nextToken());
        	int d = Integer.parseInt(st.nextToken());
        	map[a][b] = Math.min(map[a][b], d);
        }
        
        for(int i =1;i<v+1;i++) {
        	
        	for(int j =1;j<v+1;j++) {
        		for(int k=1;k<v+1;k++) {
        			if(j!=k)
        				map[j][k] = Math.min(map[j][k], map[j][i]+map[i][k]);
        		}
        	}
        }
        for(int i =1;i<map.length;i++) {
    		for(int j= 1; j<map[i].length;j++) {
    			if(map[i][j] == INF)
    				map[i][j] = 0;
    		}
    	}
        
        print2D(map);
        
        
        
    }
    
    public static void print2D(int[][] a) {
    	for(int i =1;i<a.length;i++) {
    		
    		for(int j= 1; j<a[i].length;j++) {
    			System.out.print(a[i][j]+" ");
    		}
    		System.out.println();
    	}
    }
}


