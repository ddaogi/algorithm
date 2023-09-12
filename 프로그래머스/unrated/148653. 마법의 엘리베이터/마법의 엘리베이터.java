class Solution {
   public static int solution(int storey) {
		
		int answer = 0;
		int remainder ;
		while(storey>0) {
			remainder = storey%10;
			storey = storey/10;
			
			
			
			if(remainder >=5)
			{
				if(storey%10 >=5 | remainder>=6) {
					answer += (10-remainder);
					storey++;
				}
				else
					answer += remainder;
					
			}
				
			else
				answer += remainder;
		}
		
		return answer;
	}
}