import sys
input = sys.stdin.readline

r,c = map(int,input().split())
board = []
for i in range(r):
    board.append(list(input().rstrip()))

visited = set()
dc = [0,0,1,-1]
dr = [1,-1,0,0]
max = 0
def dfs(cur_r,cur_c):
    global max
    visited.add(board[cur_r][cur_c])
    if ( len(visited) > max):
        max = len(visited)
    for i in range(4):
        next_r = cur_r + dr[i]
        next_c = cur_c + dc[i]
        if 0<= next_r < r and 0<=next_c<c and board[next_r][next_c] not in visited:
            dfs(next_r,next_c)
            visited.remove(board[next_r][next_c])

dfs(0,0)

print(max)