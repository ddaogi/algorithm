import sys
input = sys.stdin.readline
def b_search( num,low_idx, high_idx) -> bool :
    global list_a
    # list_a 안에 num이 있는지를 찾아야된다.
    
    while low_idx <= high_idx:
        mid_idx = (low_idx + high_idx) //2 
        if list_a[mid_idx] < num:
            low_idx = mid_idx + 1
        elif list_a[mid_idx] > num:
            high_idx = mid_idx -1
        else:
            return True 
        
    return False
        

# list_a 4 1 5 2 3
# list_b 1 3 7 9 5

    
n = int(input())
list_a = list(map(int,input().split()))
list_a.sort()

m = int(input())
list_b = list(map(int, input().split()))


answer_list = []

for i in list_b:
    if b_search(i,0,len(list_a)-1):
        answer_list.append(1)
    else:
        answer_list.append(0)

for i in answer_list:
    print(i)
