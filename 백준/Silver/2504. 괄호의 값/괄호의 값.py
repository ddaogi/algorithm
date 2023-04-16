import sys
input = sys.stdin.readline
arr = input().rstrip()
stack = []

temp = 1
result = 0
for i in range(len(arr)):
    if arr[i] == '(':
        stack.append(arr[i])
        temp *= 2
    elif arr[i] == '[':
        stack.append(arr[i])
        temp *= 3
    elif arr[i] == ')':
        if stack == [] or stack[-1] == '[':
            print(0)
            break
        else:
            if arr[i-1] =='(':
                result+=temp
            stack.pop()
            temp //= 2
    elif arr[i] == ']':
        if stack == [] or stack[-1] == '(':
            print(0)
            break
        else:
            if arr[i-1] =='[':
                result+=temp
            stack.pop()
            temp //= 3
else:
    if stack:
        print(0)
    else:
        print(result)