import sys
input = sys.stdin.readline

n = int(input())
maps = []
for i in range(n):
    maps.append(list(input().rstrip()))

dx = [0,0,1,-1]
dy = [1,-1,0,0]
def dfs(x,y):
    global house_cnt
    # print(x,y)
    house_cnt+=1
    visited[x][y] = True
    for i in range(4):
        next_x = x+dx[i]
        next_y = y+dy[i]
        if 0<=next_x<n and 0<= next_y < n and not visited[next_x][next_y] and maps[next_x][next_y] == '1':
            dfs(next_x,next_y)



visited = [[False] * n for _ in range(n)]
house_cnt_list =[]
cnt = 0
for i in range(n):
    for j in range(n):
        if maps[i][j] == '1' and not visited[i][j]:
            house_cnt = 0
            dfs(i,j)
            house_cnt_list.append(house_cnt)
            cnt+=1
            
print(cnt)
house_cnt_list.sort()
for i in house_cnt_list:
    print(i)