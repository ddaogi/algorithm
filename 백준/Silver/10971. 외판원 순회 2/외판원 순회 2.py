# 총 비용 (순회 하는 비용 + 마지막목적지에서 돌아오는비용)


# 가는 비용 
def dfs(start,cur,visited,cost,depth):
    global n 
    global map_

    visited[cur] = True
    
    if depth == n-1:
        if map_[cur][start] != 0:
            cost_list.append(cost+ map_[cur][start])
            #마지막목적지까지 가는 비용 (cost) +  마지막에서 출발지로 오는 비용 
        return 
    

    for i in range(n):
        if not visited[i] and map_[cur][i] != 0 :
            dfs(start,i,visited,cost+map_[cur][i], depth+1)
            visited[i] = False
    

n = int(input())
temp_list = []
map_ = [[0]* n for _ in range(n)]
for i in range(n):
    temp_list = list(map(int,input().split(" ")))
    for j in range(n):
        map_[i][j] = temp_list[j]


cost_list = []


for i in range(n):
    visited = [False] * n
    dfs(i,i,visited,0,0)
    

print(min(cost_list))