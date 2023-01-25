import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		Stack <Integer> st = new Stack<>();
		for(int i =0;i<N;i++) {
			String str= br.readLine();
			String[] temp = str.split(" ");
			if(temp[0].equals("push")) {
				st.add(Integer.parseInt(temp[1]));
			}
			else if(temp[0].equals("top")) {
				if(st.empty())
					System.out.println(-1);
				else
					System.out.println(st.peek());
			}
			else if(temp[0].equals("pop"))
				if(st.empty())
					System.out.println(-1);
				else
					System.out.println(st.pop());
			else if(temp[0].equals("size"))
				System.out.println(st.size());
			else if(temp[0].equals("empty"))
				if(st.empty())
					System.out.println(1);
				else	
					System.out.println(0);
		}
	}
	
}
