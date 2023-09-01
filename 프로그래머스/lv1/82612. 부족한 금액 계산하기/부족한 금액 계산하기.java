class Solution {
    public static long solution(int price, int money, int count) {
		long total=0;
		for(int i =0;i<count;i++) {
			total += (price*(i+1));
		}
		System.out.println(total);
		
		long answer= total-(long)money;
        if(answer<=0) return 0;
		return answer;
	}
}