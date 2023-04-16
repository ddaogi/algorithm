import sys
import heapq
input = sys.stdin.readline
min_heap =[] # 센터보다 큰 수를 저장하는 min_heap
max_heap =[] # 센터보다 작은 수를 저장하는 max_heap

ans_list = []
n = int(input())
center = int(input())  # 처음 수를 center로 저장
ans_list.append(center)
for i in range(n-1):
    new_num = int(input())
    if new_num > center :
        heapq.heappush(min_heap,new_num)
    else:
        heapq.heappush(max_heap,-new_num)
    
    # center보다 큰수를 저장하는 min_heap 에 하나 더 들어갔을 경우
    if len(min_heap) > len(max_heap)+1:
        # min heap 에서 수하나를 빼주고
        popped = heapq.heappop(min_heap)
        # center value와 비교해서 더 낮은 수를 max_heap에 넣어준다.
        if popped > center :
            heapq.heappush(max_heap, -center)
            center = popped
        else:
            heapq.heappush(max_heap, -popped)
    
    # maxheap이 클 경우 
    elif len(max_heap)> len(min_heap):
        popped = -heapq.heappop(max_heap)
        
        if(popped> center):
            heapq.heappush(min_heap,popped)
        else:
            heapq.heappush(min_heap, center)
            center = popped
    
    ans_list.append(center)

    # print(max_heap, center, min_heap)

    
for ans in ans_list:
    print(ans)