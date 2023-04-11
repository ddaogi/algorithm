def calc(height:int) -> int:
    sum = 0
    for tree in tree_h:
        result = tree-height
        if result>0:
            sum+= result
    return sum

def b_search(goal):
    # 찾아야되는 수 goal
    low = 0
    high= 1000000000
    while low<= high:
        mid = (low+high)//2
        if calc(mid)>= goal:
            # if final_mid < mid :
            #     final_mid = mid
            low = mid+1
            

        elif calc(mid)< goal:
            high = mid-1
     
    print(high)
    


if __name__ == "__main__":
    # 입력받음
    n,m = map(int,input().split())
    tree_h = list(map(int,input().split()))
    b_search(m)