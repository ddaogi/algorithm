import sys
import heapq

input = sys.stdin.readline 

heap = []
ans_list = []
n = int(input())
for i in range(n):
    input_num = int(input())
    if input_num == 0:
        if(len(heap)== 0):
            ans_list.append(0)
        else:
            ans_list.append(-heapq.heappop(heap))
    else:
        heapq.heappush(heap, -input_num)

for i in ans_list:
    print(i)    
