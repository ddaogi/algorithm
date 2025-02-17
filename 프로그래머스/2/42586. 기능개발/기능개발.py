from collections import deque
from collections import defaultdict

def solution(progresses, speeds):
    answer = []
    working_days = []
    for i in range(0,len(speeds)):
        days = 0
        percent = progresses[i]
        while(percent < 100):
            percent += speeds[i]
            days += 1
        working_days.append(days)

    print(working_days)
    temp = [] 
    count = 0
    for days in working_days:
        if temp: # 배열이 있다는건, 이미 쌓여있는게 있다는 것 
            if temp[0] >= days: # 쌓여있는것보다 적으면 쌓여야됨 
                temp.append(days)
            else: #쌓여있는것보다 크면 배열초기화 하고 쌓여있는거 앤서에 넣어줌 
                answer.append(len(temp))
                temp = [days]
        else:
            temp.append(days)

    answer.append(len(temp))
    return answer