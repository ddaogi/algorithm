import sys
input = sys.stdin.readline

# 최소거리로 설치했을때, 모든 라우터를 설치했다면 True를 리턴
def all_router(router_count,min_distance) -> bool :
    cum_distance = 0
    for distance in distances:
        cum_distance += distance
        if cum_distance >= min_distance :
            router_count-=1
            cum_distance = 0

        if router_count ==1: return True
    return False


def b_search():
    low = 0
    high = 1e9
 
    while low<= high:
        mid = (low+high)//2
        # 만약 다 설치했다면
        if all_router(c,mid):
            low = mid+1
        #설치하지 못했다면
        else: 
            high = mid-1
    print(int(high))


if __name__ == "__main__":
    # n 집의 개수, c 공유기 개수
    n,c = map(int,input().split())
    house_x = []
    for i in range(n):
        house_x.append(int(input()))
    house_x.sort()
    distances= []
    for i in range(len(house_x)-1):
        distances.append(house_x[i+1]-house_x[i])   
    b_search()

    