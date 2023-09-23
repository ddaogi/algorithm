class Solution {
    boolean solution(String s) {
        int value=0;
		for(int i =0; i<s.length();i++)
		{
			if(s.charAt(i)=='(')
				value += 1;
			else
				value -= 1;
			if(value <0) return false;
		}
		if(value != 0) return false;
		else return true;
    }
}