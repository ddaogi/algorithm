import sys
input = sys.stdin.readline
n, k = map(int, input().split())

backpack = []

dp = [0] * (k+1)

for i in range(n):
    backpack.append(list(map(int, input().split())))

for item in backpack:
    weight, value = item
    for i in range(k, weight - 1, -1):
        dp[i] = max(dp[i], dp[i - weight] + value)

print(dp[k])
