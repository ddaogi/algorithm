import sys
import math
input = sys.stdin.readline

n = int(input())
nums = list(map(int,input().split()))

nums.sort()

# 인덱스값을 

abs_sum = math.inf
result_list = [0, 0]

def b_search(nums):
    global abs_sum
    pl = 0 
    pr = len(nums)-1

    #포인터는 인덱스 값을 나타냄

    #초기값은 끝과 끝

    while pl<pr:
        sum= nums[pl] + nums[pr]
        if abs_sum > abs(sum):
            abs_sum = abs(sum)
            result_list[0] = nums[pl]
            result_list[1] = nums[pr]
        if sum > 0:
            pr = pr-1
        elif sum < 0 :
            pl = pl+1
        else:
            break     
    for i in result_list:
        print(i, end = " ")
    # result_list.append([abs(sum), nums[num_idx], nums[pc]])

# for i in range(len(nums)):
    # b_search(i)
# result_list=  sorted(result_list,key=lambda X : X[0])
# print(result_list[0][1],result_list[0][2])

# print(result_list)
b_search(nums)
# print(nums[pl])