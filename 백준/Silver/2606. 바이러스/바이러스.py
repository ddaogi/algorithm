import sys
input = sys.stdin.readline

def dfs(cur):

    visited[cur] = True

    for i in range(v+1):
        if not visited[i] and graph[cur][i] != 0:
            dfs(i)




v = int(input())
e = int(input())
graph = [[0] * (v+1) for _ in range(v+1)]
visited = [True] + [False] * v
ans_list = []
for i in range(e):
    a,b = map(int,input().split())
    graph[a][b] = 1
    graph[b][a] = 1

dfs(1)
#0 index를 True로 해줬기때문에 제외, 1번컴퓨터도 제외
print(visited.count(True)-1-1)