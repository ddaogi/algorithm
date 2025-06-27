class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int score= 0;
        int[] set_scores = new int[3];
        int star_count=0;
        int idx = -1;
        for(int i= 0; i< dartResult.length();i++){
            char ch = dartResult.charAt(i);
            
            if(ch == '1'&& dartResult.charAt(i+1) == '0'){
                answer+=score;
                 if(idx >=0) set_scores[idx] = score;
                idx++;
                score = 10;
                i++;
             
            }else if(Character.isDigit(ch)){
                answer+= score;
                   if(idx >=0) set_scores[idx] = score;
                idx++;
                score = Character.getNumericValue(ch);
             
            }else if(ch == 'D'){ score= score*score;} 
            else if(ch == 'T'){
                score = score*score*score;
            }else if(ch == '*'){
                if(idx>0){
                    set_scores[idx-1] = set_scores[idx-1]*2;
                }
                star_count +=1;
                score *= 2;
            }else if(ch == '#'){
                score = -score;
            }
          
            
        }
        set_scores[2] = score;
        for(int x:set_scores) System.out.println(x);
        answer = set_scores[0] + set_scores[1] + set_scores[2];
        
        return answer;
    }
  
}