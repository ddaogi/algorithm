
from collections import deque
def solution(players, m, k):
    answer = 0
    server_count = 1 
    server_added = 0
    
    additional_server= deque()
    for hour in range(len(players)):
        if additional_server:
            while additional_server[0] <= (hour-k):
                additional_server.popleft()
                if len(additional_server) == 0: break
        while(players[hour] >= ((len(additional_server)+1)*m)):
            additional_server.append(hour)
            answer+=1
            # print(players[hour], hour, additional_server)
        # if hour==23:
            # print(players[hour], hour, additional_server)
        
        
    return answer

# m명 미만이면 서버증설 필요 x
# n  x m  <=  ? < (n+1) * m    n대의 "추가"서버가 필요함
# k 최소 서버 운용시간

    