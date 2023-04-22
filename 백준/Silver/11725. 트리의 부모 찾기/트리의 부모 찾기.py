import sys
input = sys.stdin.readline
from collections import defaultdict
sys.setrecursionlimit(10**6)
def dfs(cur):
    visited[cur] = True
    for i in graph[cur]:
        if not visited[i]:
            ans.append([cur,i])
            child = dfs(i)
    # print(cur, child)
   
n = int(input())
ans = []

graph = defaultdict(list)
for i in range(n-1):
    a,b = map(int,input().split())
    graph[a].append(b)
    graph[b].append(a)

visited = [True] + [False] * n

dfs(1)

result = [0] * (n+1)
for i in ans:
    result[i[1]] = i[0]

# print(result)
for i in range(2,len(result)):
    print(result[i])

# print(ans)