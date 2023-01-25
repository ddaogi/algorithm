import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		LinkedList <Integer> q = new LinkedList<>();
		
		for(int i =0;i<N;i++) {
			String str= br.readLine();
			String[] temp = str.split(" ");
			if(temp[0].equals("push")) {
				q.add(Integer.parseInt(temp[1]));
			}
			else if(temp[0].equals("pop"))
				if(q.isEmpty())
					System.out.println(-1);
				else
					System.out.println(q.poll());
			else if(temp[0].equals("size"))
				System.out.println(q.size());
			else if(temp[0].equals("empty"))
				if(q.isEmpty())
					System.out.println(1);
				else	
					System.out.println(0);
			else if(temp[0].equals("front")) {
				if(q.isEmpty())
					System.out.println(-1);
				else	
					System.out.println(q.getFirst());
			}
			else if(temp[0].equals("back")) {
				if(q.isEmpty())
					System.out.println(-1);
				else	
					System.out.println(q.getLast());
			}
			
		}
	}
	
	
	
}
