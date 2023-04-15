from collections import deque



if __name__ == "__main__" :
    
    n = int(input()) # 보드의 크기
    k = int(input()) # 사과의 개수

    apple_loc = [[0] * (n+1) for _ in range(n+1)]
    
    for i in range(k):
        x,y = map(int,input().split()) # 사과위치 행,열
        apple_loc[x][y] = 1 #사과가 있으면 1로 바꿔줌
    
    
    l = int(input()) # 뱀의 방향전환 횟수

    direction = []
    for i in range(l):
        s,ld = input().split() # 시간, 뱀의 방향전환
        # s 초 뒤에, 뱀이 ld로 방향을 전환한다.
        direction.append([s,ld])

    #뱀의 초기위치 설정
    snake_loc = deque()
    snake_loc.append([1,1])
    dx = [0,1,0,-1] # 오, 아래, 왼, 위
    dy = [1,0,-1,0]
    
    #처음 방향 설정
    cur_direction = 0  # 오른쪽
    time = 0
    dir_idx = 0
    
    while True:
        time += 1
        head = snake_loc[-1]
        # head = snake_loc[-1]
        
       

        next_x = head[0] + dx[cur_direction] 
        next_y = head[1] + dy[cur_direction]

        #몸에 부딪힐 경우
        if [next_x,next_y] in snake_loc:
            break

        #벽에 부딪힐 경우
        if next_x <=0 or next_y <=0 or next_x > n or next_y > n: 
            break

        #다음 갈곳에 사과가 없을경우 머리를 넣고 꼬리를 뺌
        if apple_loc[next_x][next_y] == 0 :
            snake_loc.append([next_x,next_y])
            snake_loc.popleft()
            

        else: #사과를 먹으면 맵에서 사과 지워줌
            snake_loc.append([next_x,next_y])
            apple_loc[next_x][next_y] = 0

        # print(snake_loc)
        # print(next_x,next_y)
        # if time == 10:
            # break
        
         #방향전환해야 할 시간이 되면
        if int(direction[dir_idx][0]) == time:
            if direction[dir_idx][1] == "D": 
                cur_direction = (cur_direction+1)%4
            elif direction[dir_idx][1] == "L": 
                cur_direction = (cur_direction-1)%4
            
            if dir_idx < len(direction)-1:
                dir_idx+=1     
    print(time)
    


    
    


    

