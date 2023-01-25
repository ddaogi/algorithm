import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int x[] = new int[N];
		int y[] = new int[N];
		int max = -1000001;
		int min = 1000001;
		int[][] xys = new int[N][2];
		for(int i =0;i<N;i++) {
			String str = br.readLine();
			String[] s = str.split(" ");
			xys[i][0] = Integer.parseInt(s[0]);
			xys[i][1] = Integer.parseInt(s[1]);
		}
		
		Arrays.sort(xys, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[0] == o2[0])
					return o1[1]-o2[1];
				else
					return o1[0]-o2[0];
			}
		});
		
		for(int i =0;i<xys.length;i++) {
			System.out.println(xys[i][0]+ " " + xys[i][1]);
		}
		
			

	}
	
	
}
