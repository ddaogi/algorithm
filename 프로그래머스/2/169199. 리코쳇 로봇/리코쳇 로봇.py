from collections import deque

def solution(board):
    dx = [0, 0, 1, -1]
    dy = [1, -1, 0, 0]
    matrix = []
    for row in board:
        new_row = list(row)
        matrix.append(new_row)
        
    x_size = len(matrix[0])
    y_size = len(matrix)

    for i in range(len(matrix)):
        for j in range(len(matrix[i])):
            if matrix[i][j] == "R":
                start_x, start_y = i,j
                break
                

    def bfs(matrix, start_x, start_y):
        queue = deque([(start_x, start_y, 0)])  
        visited = set()
        visited.add((start_x, start_y))

        while queue:
                cur_x, cur_y, moves = queue.popleft()

                if matrix[cur_x][cur_y] == "G":
                    return moves

                for i in range(4):
                    next_x, next_y = cur_x, cur_y

                    while 0 <= next_x + dx[i] < y_size and 0 <= next_y + dy[i] < x_size and matrix[next_x + dx[i]][next_y + dy[i]] != "D":
                        next_x += dx[i]
                        next_y += dy[i]

                    if (next_x, next_y) not in visited:
                        visited.add((next_x, next_y))
                        queue.append((next_x, next_y, moves + 1))

        return -1
    return bfs(matrix, start_x, start_y)


