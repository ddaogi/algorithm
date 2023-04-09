import sys 

sorted = []

#divide 과정 
def merge(numList,left,mid,right):
    left_idx = mid -left + 1 #
    right_idx = right - mid 

    L = [0] * (left_idx)
    R = [0] * (right_idx)

    # 
    for i in range(left_idx):
        L[i] = numList[left+i]
    for i in range(right_idx):
        R[i] = numList[mid+1+i]

    
    i = 0     # 첫번째 어레이 인덱스
    j = 0     # 두번째 어레이 인덱스
    k = left
 
    #
    while i < left_idx and j < right_idx:
        if L[i] <= R[j]:
            numList[k] = L[i]
            i += 1
        else:
            numList[k] = R[j]
            j += 1
        k += 1
 
    #남은걸 다 넣어줌
    while i < left_idx:
        numList[k] = L[i]
        i += 1
        k += 1
 
    while j < right_idx:
        numList[k] = R[j]
        j += 1
        k += 1

def divide(numList, left, right):
    if left < right:
        mid = (left+right) //2 
        divide(numList, left, mid)
        divide(numList, mid+1, right)    
        merge(numList, left, mid ,right)
    
 
 

input=sys.stdin.readline

# T = int(sys.stdin.readline().strip())


set1 = set([])#중복 값 제거
n = int(input())
for i in range(n):
    temp = int(input())
    set1.add(temp)

list = list(set1)
divide(list,0,len(list)-1)

for _ in list:
    print(_)