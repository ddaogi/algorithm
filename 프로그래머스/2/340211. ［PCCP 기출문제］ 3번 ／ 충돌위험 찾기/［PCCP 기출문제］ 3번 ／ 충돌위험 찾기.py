from collections import defaultdict

def solution(points, routes):
    answer = 0
    
    # (r,c) 와 같이 2차원 좌표로 나타낼 수 있는 n개의 포인트 존재
    # r 이 우선순위가 더 높다.
    # 로봇들은 동시에 움직인다.
    
    points = [[0,0]]+points # points index를 맞추기 위해 앞에 패딩 추가

    visited = defaultdict(int)

    for i in range(len(routes)):
        robot_start_point = routes[i][0]
        start_r, start_c = points[robot_start_point]
        step = 1
        new_step = (0, start_r, start_c)
        visited[new_step]+=1

        for j in range(1, len(routes[i])):
            end_r, end_c = points[routes[i][j]]            
        
            while start_r != end_r :
                if end_r < start_r:
                    start_r -= 1
                else:
                    start_r += 1
                new_step = (step, start_r, start_c)
                visited[new_step]+=1
                step+=1
            while start_c != end_c:

                if end_c < start_c:
                    start_c -= 1
                else:  
                    start_c +=1
                new_step = (step, start_r, start_c)
                visited[new_step]+=1


                step+=1

    for key, value in visited.items():
        if value >= 2:
            answer += 1
    return answer