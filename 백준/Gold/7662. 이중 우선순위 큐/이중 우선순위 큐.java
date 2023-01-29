import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while (T-- > 0) {
			TreeMap<Integer, Integer> map = new TreeMap<>();
			int K = Integer.parseInt(br.readLine());
			for (int i = 0; i < K; i++) {
				String str = br.readLine();
				StringTokenizer st = new StringTokenizer(str);
				String DI = st.nextToken();
				int num = Integer.parseInt(st.nextToken());

				if (DI.equals("I")) {
					map.put(num, map.getOrDefault(num, 0) + 1);
				} else if (num == 1 & map.size() != 0) { // remove Max value
					if (map.get(map.lastKey()) == 1) {
						map.remove(map.lastKey());
					} else
						map.put(map.lastKey(), map.get(map.lastKey()) - 1);
				} else if (num == -1 & map.size() != 0) {// remove min Value
					if (map.get(map.firstKey()) == 1) {
						map.remove(map.firstKey());
					} else
						map.put(map.firstKey(), map.get(map.firstKey()) - 1);
				}

			}
			if (map.size() == 0)
				System.out.println("EMPTY");
			else
				System.out.println(map.lastKey() + " " + map.firstKey());

		}
	}
}
