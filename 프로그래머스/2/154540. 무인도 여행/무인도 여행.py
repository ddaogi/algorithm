import sys
sys.setrecursionlimit(10000)

def solution(maps):
    answer = []
    visited = [[False] * len(maps[0]) for _ in range(len(maps))]
    for i in range(len(maps)):
        for j in range(len(maps[0])):
            if maps[i][j] != 'X' and not visited[i][j]:
                visited[i][j] = True
                answer.append(dfs(maps, visited, i, j))
    if(len(answer) == 0):
        answer.append(-1)
    answer.sort()
    
    return answer

def dfs(maps, visited, cx, cy):
    dx = [0, 0, 1, -1]
    dy = [1, -1, 0, 0]
    ret = int(maps[cx][cy])
    for i in range(4):
        nx = cx + dx[i]
        ny = cy + dy[i]
        if nx < 0 or nx > len(maps) - 1 or ny < 0 or ny > len(maps[0]) - 1:
            continue
        if (not visited[nx][ny] and maps[nx][ny] != 'X'):
            visited[nx][ny]= True
            ret += dfs(maps, visited, nx, ny)
    return ret