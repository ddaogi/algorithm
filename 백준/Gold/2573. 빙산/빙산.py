
import sys
input = sys.stdin.readline
dx = [0, 0, -1, 1]
dy = [1, -1, 0, 0]
sys.setrecursionlimit(10**5)
def dfs(cur_i,cur_j,visited):
    visited[cur_i][cur_j] = True
    for i in range(4):
        next_x = cur_i+dx[i]
        next_y = cur_j+dy[i]
        if next_x >=0 and next_y >=0 and next_x < n and next_y < m and not visited[next_x][next_y] and arr[next_x][next_y] != 0:
            dfs(next_x,next_y,visited)




def four_way_check(a,b):
    zero_count = 0
    if arr[a][b] == 0: return 0
    if a-1 >=0 :
        if arr[a-1][b] == 0:
            zero_count+=1
    if b-1 >=0 :
        if arr[a][b-1] == 0:
            zero_count+=1
    if a+1 < n:
        if arr[a+1][b] == 0:
            zero_count+=1
    if b+1 < m:
        if arr[a][b+1] ==0 :
            zero_count+=1
    return zero_count

def melt_update():
    for i in range(n):
        for j in range(m):
            melt[i][j] = four_way_check(i,j)

def arr_update():
    for i in range(n):
        for j in range(m):
            arr[i][j] = arr[i][j] - melt[i][j]
            if(arr[i][j] < 0): 
                arr[i][j] = 0

n,m = map(int,input().split())
arr = []
for i in range(n):
    temp = list(map(int,input().split()))
    arr.append(temp)

melt = [[0] * m for _ in range (n)]

time = 0
while True:
    time +=1
    melt_update()
    arr_update()
    # print(arr)
    melt = [[0] * m for _ in range (n)]
    visit_cnt = 0
    visited = [[False] * m for _ in range (n)]
    for i in range(n):
        for j in range(m):
            if arr[i][j] != 0 and not visited[i][j]:
                visit_cnt +=1
                dfs(i,j,visited)
                # print(visited)
                if visit_cnt >1: break
        if visit_cnt>1: break
    if visit_cnt>1: break    
    if visit_cnt == 0 :
        time = 0
        break



print(time)





#행, 열 주의 !! arr[1][2] = 4임