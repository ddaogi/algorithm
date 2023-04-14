import sys
input = sys.stdin.readline
#stack 구현
def stack_push(num):
    global ptr
    ptr = ptr+1
    stack_arr[ptr] = num

def stack_pop():
    global ptr
    if ptr>0:
        ret = stack_arr[ptr]
        stack_arr[ptr] = 0
        ptr = ptr-1
        return ret
    else:
        return -1

def stack_size():
    return ptr

def stack_is_emtpy():
    if ptr == 0:
        return 1
    else:
        return 0

def stack_top():
    if ptr>0:
        return stack_arr[ptr]
    else:
        return -1
n = int(input())

arr_size = n +1
stack_arr = [0] * arr_size
ptr = 0

ans_list = []
input_str = []

for i in range(n):
    input_str = list(input().split())
    
    if input_str[0] == "push":
        stack_push(int(input_str[1]))
    elif input_str[0] == "pop":
        ans_list.append(stack_pop())
    elif input_str[0] == "size":
        ans_list.append(stack_size())
    elif input_str[0] == "empty":
        ans_list.append(stack_is_emtpy())
    elif input_str[0] == "top":
        ans_list.append(stack_top())


for i in ans_list:
    print(i)
