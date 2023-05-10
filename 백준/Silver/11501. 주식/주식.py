import sys
input = sys.stdin.readline

t = int(input())
answer_list = []
for i in range(t):
    n = int(input())
    nums = list(map(int,input().split()))
    curr = nums[-1]
    answer = 0
    for j in range(n-1,-1,-1):
        if nums[j] < curr:
            answer += curr-nums[j]
        else:
            curr = nums[j]
    answer_list.append(answer)

for i in answer_list:
    print(i)

