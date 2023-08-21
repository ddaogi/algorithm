def dfs(depth, n, acc_str):
    if depth == n:
        print(acc_str.strip()) 
        return

    for i in range(n):
        if not visited[i]:
            visited[i] = True
            new_str = acc_str + ' ' + str(i+1)
            dfs(depth + 1, n, new_str)
            visited[i] = False

n = int(input())
visited = [False] * n
dfs(0, n, '')
