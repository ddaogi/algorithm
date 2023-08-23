from collections import deque

def is_prime(num):
    if num == 2: return True
    if num%2 == 0 : return False
    for i in range(3,int(num**(1/2))+1,2):
        if(num%i ==0):
            return False
    return True

prime_list = []
for i in range(1000,10000):
    if(is_prime(i)):
        prime_list.append(i)

def is_movable(cur,next):
    str_cur = str(cur)
    str_next = str(next)
    count = 0
    for i in range(4):
        if(str_cur[i]!=str_next[i]):
            count+=1
    if(count == 1): return True
    
    return False

T = int(input())
while(T>0):
    T -=1
    prime1,prime2 = map(int,input().split())
    visited = set()
    visited.add(prime1)
    q= deque()
    q.append([prime1,0])
    while(q):
        cur,depth = q.popleft()
        if(cur == prime2):
            print(depth)
            break
        for i in range(len(prime_list)):
            if(is_movable(cur,prime_list[i]) and prime_list[i] not in visited):
                q.append([prime_list[i],depth+1])
                visited.add(prime_list[i])


# visited = [False] * len(prime_list)



# def dfs(depth,cur,goal,visited):
#     print(cur)
#     if(cur == goal):
#         print(depth)
#         return
#     for i in range(len(visited)):
#         if(not visited[i] and is_movable(cur,prime_list[i])):
#             visited[i] = True
#             dfs(depth+1,prime_list[i],goal,visited)
#             visited[i] = False

# dfs(0,prime1,prime2,visited)