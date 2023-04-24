import sys 
input = sys.stdin.readline
from collections import defaultdict, deque

#도시, 도로, 거리정보, 출발도시
n,m,k,x = map(int,input().split())
# n < 300,000   m< 1,000,000
q= deque()
graph = defaultdict(list)
for i in range(m):
    a,b = map(int,input().split())
    graph[a].append(b)

# print(graph)
visited = [True] + [False]*n
dijkstra = [-1] * (n+1)
def bfs():
    q.append((x,0)) 
    visited[x] = True
    while q:
        cur = q.popleft()
        cur_node = cur[0]
        depth = cur[1]
        visited[cur_node] = True
        if dijkstra[cur_node] == -1:
            dijkstra[cur_node] = depth

        # if(depth == k):
        #     ans_list.append(cur_node)
        for i in graph[cur_node]:
            if not visited[i]:
                q.append((i,depth+1))


bfs()
# print(ans_list)
# print(dijkstra.index(k))
flag = True
for i in range(len(dijkstra)):
    if dijkstra[i] == k:
        print(i)
        flag = False

if flag: 
    print(-1)