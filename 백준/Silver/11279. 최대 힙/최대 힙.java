
import java.util.*;
import java.io.*;
public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		PriorityQueue <Integer> q = new PriorityQueue<>(new Comparator<Integer>(){
			@Override
			public int compare(Integer a, Integer b) {
				return b-a;
			}
		});
		while(T-->0) {
			int input = Integer.parseInt(br.readLine());
			if(input == 0) {
				if(!q.isEmpty())
					System.out.println(q.poll());
				else
					System.out.println(0);
			}
			else {
				q.add(input);
			}
		}
	}
	



}
