import sys
input = sys.stdin.readline

n = int(input())
day = [0]*(n+1)
time = [0]*(n+1)
dp = [0]*(n+2)
for i in range(n):
    day[i+1], time[i+1] = list(map(int, input().split()))

for i in range(n, 0, -1):
    dp[i] = max(dp[i+1], dp[i])
    if (i-1) + day[i] <= n:
        
        dp[i] = max(dp[i], dp[i+day[i]]+time[i])

print(max(dp))