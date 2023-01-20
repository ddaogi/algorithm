import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		HashMap <Character,Integer> map = new HashMap<>();
		
		
		for(int i =0; i<str.length();i++) {
			char ch = Character.toUpperCase(str.charAt(i));
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		
		int max = Collections.max(map.values());
		int cnt = 0;
		char ch='a';
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			if(max == entry.getValue()) {
				cnt++;
				ch = entry.getKey();
			}
				
			if(cnt >1 ) {
				System.out.println('?');
				return;
			}
			
		}
		System.out.println(ch);
		
		
	}
	
	
}
