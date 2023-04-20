from collections import deque
import sys
input = sys.stdin.readline
text= input().strip()

stack = deque()
for ch in text:
    stack.append(ch)
    if len(stack) > 3:
        if stack[-1] == 'P' and  stack[-2] == 'A' and stack[-3] == 'P' and stack[-4] == 'P':
            stack.pop()
            stack.pop()
            stack.pop()

if stack[0] == 'P' and len(stack) == 1:
    print("PPAP")
else:
    print("NP")
        

