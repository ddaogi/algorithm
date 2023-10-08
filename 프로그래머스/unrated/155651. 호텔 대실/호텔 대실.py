from collections import deque
def solution(book_time):
    answer = 0
    time_in_mins=[]
    for i in book_time:
        start = i[0]
        end = i[1]
        s_hours,s_mins = map(int,start.split(":"))
        s_mins += s_hours*60
        e_hours,e_mins = map(int,end.split(":"))
        e_mins += e_hours*60
        time_in_mins.append( [s_mins,e_mins])

    time_in_mins.sort()
    max_count = 0
    
    end_times = []
    max_size = 0
    time_idx = 0
    for time in range(1440):
        if time_idx == len(time_in_mins): break
        
        while len(end_times) != 0 and end_times[0] == time:
            end_times.remove(time)
            
        
        while(time_idx != len(time_in_mins) and time == time_in_mins[time_idx][0]):
            end_times.append(time_in_mins[time_idx][1]+10);
            time_idx+=1
            end_times.sort()
            # print(stack)
            if(len(end_times) > max_size):
                max_size = len(end_times)
                    
    return max_size