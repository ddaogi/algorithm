import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] start = new int[N];
		int[] end = new int[N];
		int [][] arrTime = new int[N][2];
		StringTokenizer st;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			start[i] = Integer.parseInt(st.nextToken());
			end[i] = Integer.parseInt(st.nextToken());
			arrTime[i][0] = start[i];
			arrTime[i][1] = end[i];
		}
		
//		Arrays.sort(arrTime, (a,b) -> Integer.compare(a[1], b[1]));
		
		Arrays.sort(arrTime, new Comparator<int[]>() {
			@Override
			public int compare(int[]o1, int[]o2) {
				if(o1[1] == o2[1])
					return o1[0] - o2[0];
				else
					return o1[1] - o2[1];
			}
		});
		
		
		int endTime = arrTime[0][0];
		int count =0;
		for(int[] i : arrTime) {
			int startTime = i[0];
			if(endTime <= startTime) {
				endTime = i[1];
				count++;
			}
		}
		System.out.println(count);
		
		
	}
	
}
