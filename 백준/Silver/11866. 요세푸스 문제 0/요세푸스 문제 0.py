from collections import deque




n, k = map(int,input().split())

nums = deque()
for i in range(1,n+1):
    nums.append(i)
ans_list = []
while(nums) :
    nums.rotate(-k)
    ans_list.append(nums.pop())

output_str = "<" + ", ".join(str(x) for x in ans_list) + ">"
print(output_str)