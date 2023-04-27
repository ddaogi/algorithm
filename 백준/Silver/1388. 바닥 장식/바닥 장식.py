import sys
input = sys.stdin.readline
from collections import deque
stack = deque()

n,m = map(int,input().split())

room=[]
for i in range(n):
    room.append(list(input().rstrip()))

cnt = 0

#row
row_cnt= 0
for i in range(n):
    
    for j in range(m):
        if len(stack)== 0 :
            
            if room[i][j] == '-':
                row_cnt+=1
                
        else:
            if stack[-1] != '-' and room[i][j] =='-':
                row_cnt+=1
        stack.append(room[i][j])
    stack.clear()

#col
col_cnt = 0
for i in range(m):
    for j in range(n):
        if len(stack) == 0:
            if room[j][i] != '-':
                col_cnt+=1
        else:
            if stack[-1] == '-' and room[j][i] != '-':
                col_cnt+=1
        stack.append(room[j][i])
    stack.clear()

print(row_cnt+col_cnt)