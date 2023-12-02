class Solution {
    public static int solution(int n) {
		int max;
		for(int i=0;;i++)
			if(n<Math.pow(3,i)) {
				max = i-1;
				break;
			}
		int [] arr = new int [max+1];
		int idx = 0;
		for(int i = max; i>=0;i--) {
			arr[idx++] = n/(int)Math.pow(3,i);
			n = n%(int)Math.pow(3,i);
		}
		int answer = 0;
		for(int i= arr.length-1;i>=0;i--) {
			answer += arr[i]*Math.pow(3, i);
		}
		
		System.out.println(answer);
		return answer;
			
	}
}