from collections import deque
def solution(maps):
    y_len = len(maps)
    x_len = len(maps[0])
    answer = 0
    
    
    for i in range(y_len):
        for j in range(x_len):
            if(maps[i][j] == 'S'):
                start_x,start_y = j,i
                break

    
    dx = [0,0,-1,1]
    dy = [1,-1,0,0]
    q= deque()
    q.append((start_x,start_y,0))
    visited = [[False] * x_len for _ in range(y_len)]
    
    visited[start_y][start_x] = True
    Lx = 0
    Ly = 0
    while(q):
        cur_x,cur_y,distance = q.popleft()
        if(maps[cur_y][cur_x] == 'L'):
            answer+=distance
            Lx = cur_x
            Ly = cur_y
            break
        for i in range(4):
            next_x = cur_x + dx[i]
            next_y = cur_y + dy[i]
            if(next_x < 0 or next_x >= x_len or next_y<0 or next_y >= y_len):
                continue
            if(not visited[next_y][next_x] and maps[next_y][next_x] != 'X'):
                q.append((next_x,next_y,distance+1))
                visited[next_y][next_x] = True
    q=deque()
    if(answer == 0):
        answer = -1
    else:
        visited = [[False] * x_len for _ in range(y_len)]
        visited[Ly][Lx] = True
        q.append((Lx,Ly,0))
        answer2 =0
        while(q):
            cur_x,cur_y,distance = q.popleft()
            if(maps[cur_y][cur_x] == 'E'):
                answer2= distance
                break
            for i in range(4):
                next_x = cur_x + dx[i]
                next_y = cur_y + dy[i]
                if(next_x < 0 or next_x >= x_len or next_y<0 or next_y >= y_len):
                    continue
                if(not visited[next_y][next_x] and maps[next_y][next_x] != 'X'):
                    q.append((next_x,next_y,distance+1))
                    visited[next_y][next_x] = True
    
        if(answer2 == 0 ): answer = -1
        else:
            answer += answer2
    return answer