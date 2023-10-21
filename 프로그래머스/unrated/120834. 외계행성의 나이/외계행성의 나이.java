import java.util.*;
class Solution {
    public String solution(int age) {
        String answer = "";
        // a 0  j 9
        String s = "abcdefghij";
        int count =0;
        List<Integer> list = new ArrayList<>();
        while(age>0)
        {
            list.add(age%10);
            age=age/10;                
        }
        char[] arr = new char[list.size()];
        char ch;
        for(int i=0; i<list.size();i++)
        {
           ch = s.charAt(list.get(list.size()-1-i));
           arr[i] = ch;
        
           
        }
   
        
        for(int i =0; i<arr.length;i++)
        {
            answer+=arr[i];
        }
        return answer;
    }
}