def solution(schedules, timelogs, startday):
    answer = len(schedules)
    for i in range(len(schedules)):
        scheduled_time = schedules[i] 
        scheduled_time_to_mins = (scheduled_time // 100)*60 + (scheduled_time% 100)
        for j in range(7):
            timelogs_to_mins = (timelogs[i][j]//100)*60 + (timelogs[i][j]%100)
            today_day = ((startday+j)%7) 
            if today_day == 0 :
                today_day = 7
            # print(today_day)
            if (scheduled_time_to_mins+10) < timelogs_to_mins and not(today_day == 6 or today_day == 7):
                print(timelogs[i][j], schedules[i], today_day)
                answer -=1 
                break
            
                #24 시 넘어갈 경우도 체크해봐야도리듯
            
    
    return answer
 
    
    
    # schedule 희망 출근시간
    # time log 2nd array
    # start day 요일 (1월요일) 토,일은 이벤트 제외
    # + 10 분까지 