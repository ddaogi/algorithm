from collections import deque
import sys
input = sys.stdin.readline


def dfs(cur, text, depth):
    visited[cur] = True
    if len(text) == 0:
        text+=str(cur)
    else:
        text+=" "+str(cur)
    # if depth == n-1:
    #     print(text)
    #     return

    ans_dfs.append(cur)
    for i in range(1, n+1):
        if not visited[i] and graph[cur][i] == 1:
            dfs(i, text, depth+1)


def bfs(cur):
    q.append(cur)
    visited[cur] = True
    while q:
        # print(q)
        cur = q.popleft()
        for i in range(1,n+1):
            if not visited[i] and graph[cur][i] == 1:
                q.append(i)
                visited[i] = True
        ans_bfs.append(cur)

            
ans_bfs = []
ans_dfs = []

q= deque()
n,m,v = map(int,input().split())

graph= [[0] * (n+1) for _ in range(n+1)]
visited = [False] * (n+1) 
for i in range(m):
    a,b = map(int,input().split())
    graph[a][b] = 1
    graph[b][a] = 1
    

dfs(v,"",0)
for i in ans_dfs:
    print(i,end= ' ')
visited = [False] * (n+1) 
print()
bfs(v)
for i in ans_bfs:
    print(i,end= ' ')