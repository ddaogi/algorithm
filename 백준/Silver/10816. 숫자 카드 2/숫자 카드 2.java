import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		String str1 =br.readLine();
		String[] s1 = str1.split(" ");
		
		HashMap <Integer,Integer> map = new HashMap<>();
		// 상근이가 가지고있는 카드의 개수를 해쉬맵에 저장
		for(int i =0;i<N;i++) {
			map.put(Integer.parseInt(s1[i]), 
					map.getOrDefault(Integer.parseInt(s1[i]), 0)+1);			
		}
		
		StringBuilder sb = new StringBuilder();
		
		
		int M = Integer.parseInt(br.readLine());
		String str2 = br.readLine();
		String[] s2 = str2.split(" ");
		for(int i =0;i<M;i++) {
			sb.append(map.getOrDefault(Integer.parseInt(s2[i]), 0)).append(" ");
		}
		System.out.println(sb);
	}
	
}
