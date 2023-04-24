import sys
from collections import defaultdict
input= sys.stdin.readline
sys.setrecursionlimit(10**6)
def dfs(start, cur,visited,indoors):
    global count
    # cum = cum + str(cur)
    visited[cur] = True
    if(start!= cur and indoors[cur] == 1):
        # print(cum)
        count+=1
        return

    for connected in edges[cur]:
        if not visited[connected]:
            dfs(start,connected,visited)
            visited[connected]= False
    visited[cur] = False


v = int(input())

indoors_input = input().rstrip()
indoors = [0]+ list(map(int,indoors_input))

edges = defaultdict(list)
for i in range(v-1):
    a,b = map(int,input().split())
    edges[a].append(b)
    edges[b].append(a)


count = 0
visited = [True] + [False] * v

for i in range(1,v+1):
    if(indoors[i] == 1):
        dfs(i,i,visited,indoors)

print(count)