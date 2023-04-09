import sys
input = sys.stdin.readline

int(input())


def calc(str_):
    nums = list(map(int,str_.split(" ")))
    sum = 0
    for i in range(len(nums)-1):
        sum+= abs(nums[i]-nums[i+1])
    
    return sum


def permutation(idx, flag,depth,str_):
    global nums
    global perm_list
    
    str_ = str_+ str(nums[idx])
    flag[idx] = True

    if depth == len(nums)-1:
        perm_list.append(str_)
        return 
    str_ = str_+" "
    # 순열로 만드는 방법
    for i in range(len(nums)):
        if not flag[i] :
            permutation(i, flag, depth+1,str_)
            flag[i] = False



## 메인 
nums = list(map(int,input().split(" ")))
nums.sort()

flag = [False]* len(nums)
str_ = ''

perm_list = [] 
for i in range(len(nums)):
    permutation(i, flag, 0,str_)
    flag[i] = False

ret_max = 0
perm_max = ''
for perm in perm_list:
    ret = calc(perm)
    if ret> ret_max:
        ret_max = ret 

print(ret_max)

# print(perm_list)