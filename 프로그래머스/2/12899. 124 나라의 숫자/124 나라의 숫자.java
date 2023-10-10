class Solution {
   public static String solution(int n) {
		int temp;
		String digit ="abc";
		String answer = "";
		int c;
		
		while(n>0) {
			temp = n %3;
			
		   if (temp == 1) {
				digit = "1";
				c= 1;
				n=n/3;
			}
				
			else if (temp == 2){
				digit="2";
				c= 2;
				n=n/3;
			}
		   
			
			if (temp == 0 ) {
				
				digit ="4";
				c = 3;
				n=n/3-1;
			}
			
			answer = digit+answer;

			}
		
		
		System.out.println(answer);
		return answer;
		
	}
}