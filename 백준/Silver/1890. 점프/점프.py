import sys
input = sys.stdin.readline
from collections import deque
n = int(input())
board = []
for i in range(n):
    board.append(list(map(int,input().split())))

dp = [[0]*n for _ in range(n)]

dp[0][0] = 1
for i in range(n):
    for j in range(n):
        steps = board[i][j]
        if board[i][j] == 0 : break
        if i+steps < n:
            dp[i+steps][j] += dp[i][j]
        if j+steps < n:
            dp[i][j+steps] += dp[i][j]
        

print(dp[-1][-1])    
