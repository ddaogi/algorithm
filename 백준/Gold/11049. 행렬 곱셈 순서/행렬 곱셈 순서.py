import sys

n = int(sys.stdin.readline())
lst = [list(map(int, sys.stdin.readline().split())) for _ in range(n)]

dp = [[0]*n for _ in range(n)] #2차원 배열 생성

for i in range(1, n): 
    for j in range(n-i): 
        dp[j][j+i] = 2**31
        for k in range(j, j+i): 
            dp[j][j+i] = min(dp[j][j+i], dp[j][k] + dp[k+1][j+i] + lst[j][0]*lst[k][1]*lst[j+i][1])

print(dp[0][n-1])
