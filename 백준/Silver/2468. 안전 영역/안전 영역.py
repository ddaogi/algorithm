import sys
sys.setrecursionlimit(100000)
def flood(height):
    global n
    global graph
    for i in range(n):
        for j in range(n):
            if graph[i][j] < height:
                graph[i][j] = 0

def all_flood():
    for i in range(n):
        for j in range(n):
            if graph[i][j] != 0:
                return False
    return True

def dfs(x,y,visited,depth):
    dx = [1, 0, -1, 0]
    dy = [0, 1, 0 , -1]
  
    if visited[x][y] : return 
    if depth >= n*n: return 
    visited[x][y] = True
    for i in range(4):
        next_x = x+dx[i] 
        next_y = y+dy[i]
        if next_x<0 or next_x>n-1 or next_y <0 or next_y>n-1:
            continue
        if graph[next_x][next_y] != 0:
            dfs(next_x,next_y,visited,depth+1)



##############################
n = int(input())
temp_list = []
graph = [[0]* n for _ in range(n)]
for i in range(n):
    temp_list = list(map(int,input().split(" ")))
    for j in range(n):
        graph[i][j] = temp_list[j]
###### 입력받는 곳


area_count = []


for i in range(1,100):
    flood(i) # 물이 차오르는 것 
    visited = [[False] * n for _ in range(n)]
    count = 0
    for j in range(n):
        for k in range(n):
            if not visited[j][k] and graph[j][k] !=0 :
                dfs(j,k,visited,0)
                count+=1
    area_count.append(count)
    if all_flood(): break

print(max(area_count))

