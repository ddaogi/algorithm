# import sys
# input = sys.stdin.readline
# from collections import deque
# r, c = map(int,input().split())

# dx = [0,0,1,-1] 
# dy = [1,-1,0,0]
# maps=[list(input().strip()) for _ in range(r)]

# ans = "KAKTUS"
# q = deque()
# water_xy = deque()

# def find_sd():
#     for i in range(r):
#         for j in range(c):
#             if maps[i][j] == 'S':
#                 start = (i,j)
#             if maps[i][j] == '*':
#                 water_xy.append((i,j))
#     return start


# def water_flood():
#     global water_xy
#     length = len(water_xy)
#     for i in range(length):
#         xy = water_xy.popleft()
#         cur_x = xy[0] 
#         cur_y = xy[1]
#         for i in range(4):
#             next_x = cur_x+dx[i]
#             next_y = cur_y+dy[i]
#             if 0<= next_x < r and 0 <= next_y < c and maps[next_x][next_y] == '.':
#                 maps[next_x][next_y] = '*'
#                 water_xy.append((next_x,next_y))
    
        

# def bfs(start_x,start_y):
#     global ans
#     depth = 0
#     q.append([start_x,start_y,depth]) # 행, 열, 깊이를 저장
#     water_flood()
#     while q:
#         x,y,new_depth= q.popleft()
#         if depth != new_depth :
#             water_flood()
#             depth = new_depth
        
#         if( maps[x][y] == 'D'):
#             ans = depth
#             break
        
#         maps[x][y] = 'X'

#         for i in range(4):
#             next_x = x+dx[i]
#             next_y = y+dy[i]
#             if 0 <= next_x < r and 0 <= next_y < c and (maps[next_x][next_y] == '.'  or maps[next_x][next_y]== 'D'):
#                 q.append([next_x,next_y,depth+1])

# start = find_sd()

# bfs(start[0],start[1])
# del(water_xy)
# print(ans)


import collections
import sys
input = sys.stdin.readline

n, m = map(int, input().split())

graph = [list(input().strip()) for _ in range(n)]
distance = [[0] *m for _ in range(n)]
dx, dy = [-1, 1, 0, 0], [0, 0, -1, 1]
queue = collections.deque()

def bfs(Dx,Dy):
    while queue:
        x,y = queue.popleft()
        if graph[Dx][Dy] == 'S':
            return distance[Dx][Dy]
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if 0 <= nx < n and 0 <= ny < m:
                if (graph[nx][ny] == '.' or graph[nx][ny] == 'D') and graph[x][y] == 'S':
                    graph[nx][ny] = 'S'
                    distance[nx][ny] = distance[x][y] + 1
                    queue.append((nx,ny))
                elif (graph[nx][ny] =='.' or graph[nx][ny] =='S') and graph[x][y] == '*':
                    graph[nx][ny] = '*'
                    queue.append((nx,ny))
    return "KAKTUS"


for x in range(n):
    for y in range(m):
        if graph[x][y] == 'S':
            queue.append((x,y))
        elif graph[x][y] == 'D':
            Dx,Dy = x,y

for x in range(n):
    for y in range(m):
        if graph[x][y] == '*':
            queue.append((x,y))

print(bfs(Dx,Dy))