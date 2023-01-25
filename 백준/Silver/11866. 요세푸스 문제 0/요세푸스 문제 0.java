import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		Queue <Integer> q = new LinkedList<>();
		for(int i =1;i<=N;i++)
			q.add(i);
		String answer = "<";
		while(!q.isEmpty()) {
			for(int i =0;i<K-1;i++) {
				q.add(q.poll());
			}
			answer+= q.poll()+", ";
		}
		answer = answer.substring(0, answer.length()-2);
		answer+= ">";
		System.out.println(answer);

	}
	
	
}
