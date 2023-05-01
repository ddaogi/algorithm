import sys
input = sys.stdin.readline
from collections import deque
n,k = map(int,input().split()) # n= 멀티탭 구멍 개수  # k = 전기용품 총 사용회수
items =list(map(int,input().split()))

in_items = set()

cnt = 0
for i in range(len(items)):
    new = items[i]
    flag = False
    if len(in_items) < n :
        in_items.add(new)
        continue
    
    #이미 멀티탭에 꼽혀있으면 굳이 바꿀 필요가 없음
    if new in in_items:
        continue

    # 새로운 전자기기가 멀티탭에 안꼽혀있을 경우
    remain = []
    for j in range(i+1,len(items)):
        if (items[j] in in_items) and (items[j] not in remain):
            remain.append(items[j])
    
    for in_item in in_items:
        if in_item not in remain:
            in_items.remove(in_item)
            cnt+=1
            in_items.add(new)
            flag = True
            break
    
    if not flag:
        in_items.remove(remain[-1])
        cnt+=1
        in_items.add(new)    
    
    # print(in_items)
print(cnt)


    

