import sys
from collections import deque
input = sys.stdin.readline

n,k = map(int,input().split())
coins = []

for i in range(n):
    coins.append(int(input()))

visited = [False] * (k+1) # 방문 여부 체크
q = deque()
result = -1
def bfs():
    global result
    q.append([0,0]) # current price, depth
    visited[0] = True # 시작점 방문 표시

    while q:
        cur_price, cnt = q.popleft()
        if cur_price == k:
            result = cnt
            return
        for i in coins:
            if cur_price+i <= k and not visited[cur_price+i]:
                visited[cur_price+i] = True
                q.append([cur_price+i,cnt+1])

bfs()
print(result)
