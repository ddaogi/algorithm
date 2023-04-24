from collections import deque
import sys
input = sys.stdin.readline
n,m = map(int,input().split())
maze = []

q = []

dx = [0,0,1,-1]
dy = [1,-1,0,0]
for i in range(n):
    temp = list(map(int,input().rstrip()))
    maze.append(temp)

def bfs(cur_x,cur_y):
    q.append((cur_x,cur_y,0))
    while len(q)!=0:
        cur = q.pop(0)
        cur_x = cur[0]
        cur_y = cur[1]
        depth = cur[2]
        
        if cur_x == n-1 and cur_y == m-1 :
            print(depth+1)
            break
        
        maze[cur_x][cur_y] = 0
        for i in range(4):
            next_x = cur_x+dx[i]
            next_y = cur_y+dy[i]
            if next_x >=0 and next_y >=0 and next_x<n and next_y<m and maze[next_x][next_y] != 0:
                q.append((next_x,next_y,depth+1))
                maze[next_x][next_y] = 0

bfs(0,0)
