import java.util.*;
class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int op_start_int = timeToInt(op_start);
        int op_end_int = timeToInt(op_end);
        int pos_int = timeToInt(pos);
        int video_len_int =timeToInt(video_len);
        
        for(String s : commands){
            if(pos_int >= op_start_int && pos_int <=op_end_int){
                pos_int = op_end_int;
            }
            if(s.equals("next")){
                pos_int += 10;
            }else if(s.equals("prev")){
                pos_int -= 10;
            }
            if(pos_int >= op_start_int && pos_int <=op_end_int){
                pos_int = op_end_int;
            }
            if (pos_int < 0) {
                pos_int = 0;
            }
            if (pos_int >= video_len_int) {
                pos_int = video_len_int;
            }
            System.out.println(pos_int);
        }
        return intToTime(pos_int);

    }
    public int timeToInt(String curTime){
        String[] parts = curTime.split(":"); // ["HH", "mm"]
        return Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
    }
      public String intToTime(int totalMinutes) {
        int hours = totalMinutes / 60;
        int minutes = totalMinutes % 60;
        return String.format("%02d:%02d", hours, minutes);
    }
    
}