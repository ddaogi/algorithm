import java.io.*;
import java.util.*;

public class Main{
	
	public static void main(String[] args)throws IOException {
		HashMap <String,Integer> map = new HashMap<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		String[] strs = new String[n]; 
		for(int i =0;i<n;i++) {
			strs[i] = br.readLine();
			for(int j =0;j<strs[i].length();j++) {
				String temp = ""+strs[i].charAt(j);
				int base = strs[i].length() - j;
			    int added = (int)Math.pow(10, base-1);
				//자릿수의 합을 더해줌
				map.put((temp),map.getOrDefault(temp,0)+added);
			}
		}
		
		int [] nums = {9,8,7,6,5,4,3,2,1,0};
		int idx = 0;
		
		
		int size = map.size();
		int ans = 0;
		while(size-- > 0) {
			
			String maxKey = Collections.max(map.entrySet(), (entry1, entry2) -> entry1.getValue() - entry2.getValue()).getKey();
			ans+= map.get(maxKey)* nums[idx++];
			map.put(maxKey, 0);
		}
		System.out.println(ans);

	}
}