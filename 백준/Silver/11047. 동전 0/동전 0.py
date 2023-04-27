import sys
from collections import deque
input = sys.stdin.readline
n, k = map(int,input().split())

coins = deque()
for i in range(n):
    coins.append(int(input()))

big_coin = coins.pop()
coin_cnt = 0
while k>0:    
    while big_coin > k:
        big_coin = coins.pop()
    coin_cnt+= k//big_coin
    k= k- (k//big_coin)*big_coin
print(coin_cnt)
