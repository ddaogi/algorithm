import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**6)
def dfs(cur):

    visited[cur] = True

    for i in range(v+1):
        if not visited[i] and graph[cur][i] != 0 :
            dfs(i)

    return 




if __name__ == "__main__":
    v,e = map(int,input().split())
    graph = [[0] * (v+1) for _ in range(v+1)]
    for i in range(e):
        a,b = map(int,input().split())
        graph[a][b] = 1
        graph[b][a] = 1
    visited = [True] + [False] * v
    cnt = 0
    for i in range(v+1):
        if not visited[i]:
            dfs(i)
            cnt+=1 
            # print(visited)
    print(cnt)
