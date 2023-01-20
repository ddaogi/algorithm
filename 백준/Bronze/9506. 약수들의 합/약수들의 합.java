import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int num = sc.nextInt();
			if(num == -1) break;
			StringBuilder sb = new StringBuilder();
			List<Integer> list = new ArrayList<>();
			sb.append(num).append(" = ");
			int sum =0;
			for(int i =1;i<=Math.sqrt(num);i++) {
				if(num%i == 0) {
					list.add(i);
					sum+= i ;
					if(i!=1) {
						list.add(num/i);
						sum+=num/i;
					}
				}
			}
			
			Collections.sort(list);
			if(sum!= num)
				System.out.printf("%d is NOT perfect.\n",num);
			else {
				for(int i=0;i<list.size();i++) {
					sb.append(list.get(i));
					if(i!=list.size()-1)
						sb.append(" + ");
				}
				System.out.println(sb);
			}

		}
	}

}
