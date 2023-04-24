import sys
from collections import defaultdict
input= sys.stdin.readline

ans = 0
n,m = map(int,input().split()) # 구슬개수, 쌍의 개수
lighter = defaultdict(list)
heavier = defaultdict(list)
for i in range(m):
    a,b = map(int,input().split())
    lighter[a].append(b)
    heavier[b].append(a)

def heavier_dfs(cur):
    visited[cur] = True
    for i in heavier[cur]:
        if not visited[i]:
            heavier_dfs(i)

def lighter_dfs(cur):
    visited[cur] = True
    for i in lighter[cur]:
        if not visited[i]:
            lighter_dfs(i)

for i in list(heavier):
    visited = [False] * (n+1)
    heavier_dfs(i)
    if(visited.count(True)-1 >= (n+1)//2):
        ans+=1



for i in list(heavier):
    visited = [False] * (n+1)
    lighter_dfs(i)
    if(visited.count(True)-1 >= (n+1)//2):
        ans+=1
    
print(ans)