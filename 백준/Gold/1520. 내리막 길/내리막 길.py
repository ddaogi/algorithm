import sys
input = sys.stdin.readline
from collections import deque
# 오 아래로만 이동 가능

r,c = map(int,input().split())
maps = []
for i in range(r):
    maps.append(list(map(int,input().split())))

#이동 가능한 경로의 수 H?

dx = [0,0,-1,1]
dy = [1,-1,0,0]


def dfs(cur_r,cur_c):
    if dp[cur_r][cur_c] != -1:
        return dp[cur_r][cur_c]
    
    if cur_r == r-1 and cur_c == c-1:
        return 1
    dp[cur_r][cur_c] = 0
    for i in range(4):
        next_r = cur_r+dx[i]
        next_c = cur_c+dy[i]
        if 0<=next_r<r and 0<=next_c<c and maps[next_r][next_c] < maps[cur_r][cur_c]: 
            dp[cur_r][cur_c] += dfs(next_r,next_c)
    return dp[cur_r][cur_c]

dp = [[-1] * c for _ in range(r)]

print(dfs(0,0))
    

