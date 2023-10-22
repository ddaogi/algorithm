import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        		int temp;
		int answer=0;
		int idx2;
		Queue <Integer> move = new LinkedList<>();
		Stack <Integer> stack= new Stack<>();
		for(int i =0;i<moves.length;i++)
		{
			move.add(moves[i]);
		}
		while (!move.isEmpty()) {
			idx2 = move.poll()-1;
			for (int i = 0; i < board.length; i++) {
				if (board[i][idx2] != 0) {
//					System.out.println(" test:"+board[i][idx2]);
					temp = board[i][idx2];
					board[i][idx2] = 0;
					if (stack.empty()) {
						stack.push(temp);
					}
					else if (stack.peek() == temp) {
						answer+=2;
						stack.pop();
					}
					else stack.push(temp);
					
					break;
				}
			}
		}

		return answer;
    }
}