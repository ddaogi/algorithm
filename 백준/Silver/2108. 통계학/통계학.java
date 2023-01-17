import java.util.*;
import java.util.Map.Entry;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] nums = new int[N];
		int sum = 0;
		int max = -4001;
		int min = 4001;
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<N;i++) {
			nums[i]= sc.nextInt();
			sum+= nums[i];
			max = Math.max(nums[i], max);
			min = Math.min(nums[i], min);
			int count = map.getOrDefault(nums[i], 0);
			map.put(nums[i], count+1);
		}
				
		List<Integer> list = new ArrayList<>();
		int most = Collections.max(map.values());
		Set<Map.Entry<Integer,Integer >> entries = map.entrySet();
		for(Entry<Integer,Integer> entry:entries) {
			if(entry.getValue() == most)
				list.add(entry.getKey());	
		}
		Collections.sort(list);
		
		
		int frequent;
		if(list.size()==1)
			frequent = Integer.parseInt(list.get(0).toString());
		else
			frequent = Integer.parseInt(list.get(1).toString());
			
		
		double avg = (double)sum/N;
		
		
		
	
		// 1avg
		if(avg>-0.5 & avg <0) avg=0;
		System.out.printf("%.0f\n",avg);
		//2 median
		
		Arrays.sort(nums);
		
		System.out.println(nums[(N/2)]);
		//3 most frequent
		System.out.println(frequent);

		//4 answer
		System.out.println(max-min);
		
		
		sc.close();
	}
}
