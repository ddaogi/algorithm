import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); //
		int M = Integer.parseInt(st.nextToken());// 비밀번호 찾고싶은 사이트수
		HashMap <String,String> map = new HashMap<>();
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			String site = st.nextToken();
			String pw = st.nextToken();
			map.put(site,pw);
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<M;i++) {
			sb.append(map.get(br.readLine())).append("\n");
		}
		System.out.println(sb);
	}

}


