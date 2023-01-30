
import java.util.*;
import java.io.*;

public class Main {
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int [] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		TreeMap<Integer, Integer> map = new TreeMap<>();
		for(int i = 0;i<N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			map.put(arr[i], 1);
		}
		int idx =0;
		for(Integer key: map.keySet()) {
			map.put(key, idx);
			idx++;
		}
		StringBuilder sb = new StringBuilder();
		for(int i : arr) {
			sb.append(map.get(i)+" ");
		}
		System.out.println(sb);
		
		
		
	}

}

