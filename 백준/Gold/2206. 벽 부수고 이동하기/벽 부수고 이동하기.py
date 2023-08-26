from collections import deque

N, M = map(int, input().split())

maps = [list(input()) for _ in range(N)]

dx = [0, 0, 1, -1]
dy = [1, -1, 0, 0]

q = deque()

visited = [[[False]*2 for _ in range(M)] for _ in range(N)]
q.append((0, 0, 0, 1))  # x, y, depth, chance
visited[0][0][1] = True

answer = False

while q:
    cur_x, cur_y, depth, chance = q.popleft()
    
    if cur_x == N-1 and cur_y == M-1:
        print(depth + 1)
        answer = True
        break

    if depth > N * M:
        break

    for i in range(4):
        next_x, next_y = cur_x + dx[i], cur_y + dy[i]

        if 0 <= next_x < N and 0 <= next_y < M:
            if not visited[next_x][next_y][chance]:
                if maps[next_x][next_y] == '0':
                    q.append((next_x, next_y, depth + 1, chance))
                    visited[next_x][next_y][chance] = True
                elif chance == 1:
                    q.append((next_x, next_y, depth + 1, 0))
                    visited[next_x][next_y][0] = True

if not answer:
    print(-1)
