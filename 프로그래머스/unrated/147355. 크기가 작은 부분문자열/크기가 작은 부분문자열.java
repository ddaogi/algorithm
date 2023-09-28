class Solution {
    public int solution(String t, String p) {
      long comp = Long.parseLong(p);
		int answer=0;
		for(int i=0;i<=(t.length()-p.length());i++){
			
			long temp = Long.parseLong(t.substring(i,i+p.length()));
			if(temp <= comp)
				answer++;
		}
		
		return answer;
    }
}