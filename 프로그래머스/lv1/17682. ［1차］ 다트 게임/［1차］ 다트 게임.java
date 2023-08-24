class Solution {
    public static int solution(String dartResult) {
		int tempNum=0;
		int answer = 0;
		int [] arr = new int[3];
		int idx =0;
		for (int i = 0; i < dartResult.length(); i++) {

			char ch = dartResult.charAt(i);

			
			
			
			
			if (Character.isDigit(ch)) {
				if (Character.isDigit(dartResult.charAt(i + 1))) {
					tempNum = 10;
					i++;
				}

				else
					tempNum = Integer.parseInt("" + ch);

			}

			else if (ch == 'S') {
				arr[idx++] = tempNum;
				
			} else if (ch == 'D') {
				
				arr[idx++] = tempNum*tempNum;

			} else if (ch == 'T') {
				arr[idx++] = tempNum*tempNum*tempNum;
			} else if (ch == '*') {
				int cnt = 0;
				for(int j =idx-1;j>=0;j--)
				{
					arr[j]*=2;
					cnt++;
					if(cnt == 2) break;
				}
			} else if (ch == '#') {
				arr[idx-1] = -arr[idx-1];
			}
			
			

		}
		for(int i : arr)
			answer+=i;
			
		
		return answer;
	}
}