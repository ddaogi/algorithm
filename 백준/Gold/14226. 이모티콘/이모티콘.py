from collections import deque
S = int(input())

q = deque()

visited = set()
q.append([1,0,0])
while(q):
    num,depth,clipboard = q.popleft()
    if( num == S):
        print(depth)
        break
    
    visited.add(num)
    if(num-1 not in visited):
        q.append([num-1,        depth+1,clipboard])
    if(num+clipboard not in visited):
        q.append([num+clipboard,depth+1,clipboard])
    q.append([num,          depth+1,num])


