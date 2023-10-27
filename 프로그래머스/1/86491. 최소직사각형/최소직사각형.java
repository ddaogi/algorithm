class Solution {
    public int solution(int[][] sizes) {
       int answer=0;
		int longSide;
		int shortSide;
		int maxLong=0;
		int maxShort=0;
		for(int[] i:sizes) {
			if(i[0]> i[1]) {
				longSide = i[0];
				shortSide = i[1];
			}
			else {
				longSide = i[1];
				shortSide = i[0];
			}
			
			if(longSide > maxLong)
				maxLong=longSide;
			if(shortSide> maxShort)
				maxShort=shortSide;
		}
		answer= maxLong*maxShort;		
		return answer;
    }
}