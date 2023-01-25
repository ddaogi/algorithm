import java.util.*;
import java.io.*;
public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		
		int N = Integer.parseInt(br.readLine());
		Queue <Integer> q = new LinkedList<>();
		for(int i =1;i<=N;i++) {
			q.add(i);			
		}
		while(!q.isEmpty()) {
			if(q.size() == 1) {
				System.out.println(q.poll());
				break;
			}
			q.remove();
			q.add(q.poll());
		}
			
		
	}
}


