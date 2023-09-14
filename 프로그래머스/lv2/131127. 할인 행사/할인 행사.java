import java.util.*;
class Solution {
    public static int solution(String[] want, int[] number, String[] discount) {
		int answer = 0;
		int idx=0;
		String[] wantNum = new String[10];
		for(int i = 0; i<want.length;i++) {
			for(int j = 0; j< number[i]; j++) {
				wantNum[idx++] = want[i];
			}
		}
		Arrays.sort(wantNum);
//		System.out.println(Arrays.toString(wantNum));
		int dcIdx = 0;
		String[] dc10= new String[10];
		for(int i = 0 ;i<discount.length;i++) {
			dcIdx = i%10;
			dc10[dcIdx] = discount[i];			
			if(i>=9) {
				String [] tempArr= dc10.clone();
				Arrays.sort(tempArr);	
				if(Arrays.equals(tempArr,wantNum))
					answer ++;
			}
		}

		return answer;
	}	
}