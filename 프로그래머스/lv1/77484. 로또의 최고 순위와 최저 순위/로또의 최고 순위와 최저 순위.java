
class Solution {
    public static 	int[] solution(int[] lottos, int[] win_nums) {
		int same = 0;;
		int joker = 0;
		for (int i : lottos) {
			if (i == 0)
				joker++;
			else {
				for (int j : win_nums) {
					if(i == j) {
						same++;
						break;
					}
				}
			}
		}
		
        
		int[] ret = {Math.min(6,7-joker-same),Math.min(6,7-same)};
		
		return ret;
	}
}