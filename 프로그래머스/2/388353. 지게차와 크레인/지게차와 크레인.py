from collections import deque

def solution(storage, requests):
    n, m = len(storage), len(storage[0])
    grid = [list(row) for row in storage]

    def bfs_forklift(grid, ch):
        visited = [[False]*m for _ in range(n)]
        q = deque()
        for i in range(n):
            for j in (0, m-1):
                if grid[i][j] == '.' and not visited[i][j]:
                    visited[i][j] = True
                    q.append((i, j))
        for j in range(m):
            for i in (0, n-1):
                if grid[i][j] == '.' and not visited[i][j]:
                    visited[i][j] = True
                    q.append((i, j))

        while q:
            x, y = q.popleft()
            for dx, dy in ((1,0),(-1,0),(0,1),(0,-1)):
                nx, ny = x+dx, y+dy
                if 0 <= nx < n and 0 <= ny < m and not visited[nx][ny] and grid[nx][ny] == '.':
                    visited[nx][ny] = True
                    q.append((nx, ny))
        to_remove = set()
        for i in range(n):
            for j in (0, m-1):
                if grid[i][j] == ch:
                    to_remove.add((i, j))
        for j in range(m):
            for i in (0, n-1):
                if grid[i][j] == ch:
                    to_remove.add((i, j))
        for i in range(n):
            for j in range(m):
                if grid[i][j] == ch:
                    for dx, dy in ((1,0),(-1,0),(0,1),(0,-1)):
                        nx, ny = i+dx, j+dy
                        if 0 <= nx < n and 0 <= ny < m and visited[nx][ny]:
                            to_remove.add((i, j))
                            break

        for x, y in to_remove:
            grid[x][y] = '.'

    def use_crane(grid, ch):
        for i in range(n):
            for j in range(m):
                if grid[i][j] == ch:
                    grid[i][j] = '.'

    for req in requests:
        if len(req) == 1:
            bfs_forklift(grid, req[0])
        else:
            use_crane(grid, req[0])

    return sum(cell != '.' for row in grid for cell in row)
