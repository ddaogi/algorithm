import sys
input = sys.stdin.readline
from collections import deque
# 각 행,열은 N개의 원소로 구성, 바일
n,k = map(int,input().split()) # n<=200,  K<=1000  


maps = []
for i in range(n):
    maps.append(list(map(int,input().split())))

s,x,y = map(int,input().split())

q = deque()
first_loc = []
for i in range(n):
    for j in range(n):
        if maps[i][j] != 0 :
            first_loc.append([maps[i][j],i,j])

first_loc.sort() ## 1번부터 실행하기위한 정렬

def bfs():
    dx = [0,0,1,-1]
    dy = [1,-1,0,0]

    for i in range(len(first_loc)):
        init_loc = first_loc[i]
        q.append((init_loc[0], init_loc[1],init_loc[2],0)) # 바이러스번호, x,y 좌표와 현재시간을 같이 저장
    while q:
        temp = q.popleft()
        virus_num,cur_x,cur_y,time = temp
        if time>s: break
        for i in range(4):
            next_x = cur_x+ dx[i]
            next_y = cur_y+ dy[i]
            if 0<=next_x<n and 0<= next_y < n and maps[next_x][next_y] == 0:
                if time+1 <=s:
                    maps[next_x][next_y]=virus_num
                q.append((virus_num,next_x,next_y,time+1))

bfs()
# print(q)
print(maps[x-1][y-1])

