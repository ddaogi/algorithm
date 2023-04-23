import sys
from collections import defaultdict
input= sys.stdin.readline


def dfs(start, cur,visited,cum):
    global count
    cum = cum + str(cur)
    visited[cur] = True
    if(start!= cur and indoors[cur] == 1):
        # print(cum)
        count+=1
        return

    for connected in edges[cur]:
        if not visited[connected]:
            dfs(start,connected,visited,cum)
            visited[connected]= False


v = int(input())

indoors_input = input().rstrip()
indoors = [0]+ list(map(int,indoors_input))

edges = defaultdict(list)
for i in range(v-1):
    a,b = map(int,input().split())
    edges[a].append(b)
    edges[b].append(a)


count = 0

for i in range(1,v+1):
    if(indoors[i] == 1):
        visited = [True] + [False] * v
        dfs(i,i,visited,"")

print(count)