import heapq


n = int(input())
nums = []

for i in range(n):
    heapq.heappush(nums,int(input()))

# 최소힙    
sum = 0
while len(nums)>1:
    temp = heapq.heappop(nums) + heapq.heappop(nums)
    sum += temp
    heapq.heappush(nums,temp)

print(sum)
