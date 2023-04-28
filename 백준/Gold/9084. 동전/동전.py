import sys
input = sys.stdin.readline
t = int(input())

for _ in range(t):

    n = int(input())
    coins = list(map(int, input().split()))
    goal = int(input())

    dp = [0] * (goal+1)
    dp[0] = 1
    for coin in coins:
        for i in range(1, goal+1):
            if i >= coin:
                dp[i] += dp[i-coin]
    print(dp[goal])