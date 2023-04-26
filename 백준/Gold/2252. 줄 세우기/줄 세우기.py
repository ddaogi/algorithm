import sys
input = sys.stdin.readline
from collections import defaultdict, deque
n,m = map(int,input().split())

no_incoming_v = deque()
incoming_cnt = [0] * (n+1)
edges = defaultdict(list)
for i in range(m):
    a,b = map(int,input().split())
    edges[a].append(b)
    incoming_cnt[b]+=1

for i in range(1,n+1):
    if incoming_cnt[i] == 0:
        no_incoming_v.append(i)

ans_list = []
while no_incoming_v:
    vertex = no_incoming_v.popleft()
    ans_list.append(vertex)
    for next_v in edges[vertex]:
        incoming_cnt[next_v]-=1
        if incoming_cnt[next_v] == 0:
            no_incoming_v.append(next_v)

for i in ans_list:
    print(i, end= ' ')

