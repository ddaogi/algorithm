import java.util.*;
import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> leftstack = new Stack<>();
		Stack<Character> rightstack = new Stack<>();

		String str = br.readLine();
		for (int i = 0; i < str.length(); i++)
			leftstack.push(str.charAt(i));

		int cnt = Integer.parseInt(br.readLine());

		for (int i = 0; i < cnt; i++) {
			String order = br.readLine();
			switch (order.charAt(0)) {
			case 'L':
				if (!leftstack.isEmpty())
					rightstack.push(leftstack.pop());
				break;
			case 'D':
				if (!rightstack.isEmpty())
					leftstack.push(rightstack.pop());
				break;
			case 'B':
				if (!leftstack.isEmpty())
					leftstack.pop();
				break;
			case 'P':
				leftstack.push(order.charAt(2));
			}
		}

		while (!leftstack.isEmpty())
			rightstack.push(leftstack.pop());

		StringBuilder sb = new StringBuilder();

		while (!rightstack.isEmpty())
			sb.append(rightstack.pop());

		System.out.print(sb);
	}
}
