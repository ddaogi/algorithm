import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		String[] arr = new String[N];
		for (int i = 0; i < N; i++) {
			String temp = sc.nextLine();
			Stack <Character> st = new Stack<>();
			boolean stop = false;

			for(int j = 0;j<temp.length();j++) {
				if(temp.charAt(j) == '(') {
					st.push('(');
				}
				else {
					if(!st.isEmpty())
						st.pop();
					else {
						stop = true;
						break;
					}			
				}
			}
			if(st.empty() && !stop)
				System.out.println("YES");
			else
				System.out.println("NO");

		}	
	}
}
