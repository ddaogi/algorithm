import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		String ans = "";
		StringBuilder sb =new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		PriorityQueue <Integer>heap = new PriorityQueue<>();
		for(int i =0;i<N;i++) {
			int input = Integer.parseInt(br.readLine());
			if(input == 0) {
				if(heap.isEmpty())
					sb.append("0\n");
				else
					sb.append(heap.poll()+"\n");
			}
			else
				heap.add(input);
		}
		System.out.println(sb);
	}
}
