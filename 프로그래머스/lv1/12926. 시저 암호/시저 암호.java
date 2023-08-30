class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i =0; i<s.length();i++){
            char ch = s.charAt(i);
            
            if(s.charAt(i) == ' ')
                answer+= s.charAt(i);
            else if(s.charAt(i) <= 'z' & s.charAt(i) +n > 'z' ) answer+= (char)(ch+n-1-('z'-'a'));
            else if(s.charAt(i) <= 'Z' & s.charAt(i) +n > 'Z' ) answer+= (char)(ch+n-1-('Z'-'A')); 
            else
                answer+= (char)(s.charAt(i)+n);
        }
        return answer;
    }
}