N,M = map(int,input().split())
soldiers = []
for i in range(M):
    string = input()
    str_array = []
    for i in string:
        str_array.append(i)
    soldiers.append(str_array)

visited = []
for _ in range(M):
    visited.append([False]*N)

dx = [0,0,1,-1]
dy = [1,-1,0,0]
def dfs(cur_x,cur_y):
    visited[cur_x][cur_y] = True
    for i in range(4):
        next_x = dx[i]+cur_x
        next_y = dy[i]+cur_y
        if(0<= next_x <M and 0<=next_y<N):
            if(not visited[next_x][next_y] and soldiers[cur_x][cur_y] == soldiers[next_x][next_y]):
                # visited[next_x][next_y]= True
                dfs(next_x,next_y)

score_B = 0
score_W = 0
count = 0
for i in range(M):
    for j in range(N):
        if(not visited[i][j]):
            dfs(i,j)
            new_count = sum(map(sum, visited))
            score_count = new_count - count 
            count = new_count
            score = score_count*score_count
            if(soldiers[i][j] == 'B'):
                score_B+=score
            else:
                score_W+=score

print(score_W, score_B)