# N 강의의 수
# M 블루레이의 수 

n,m = map(int,input().split())
minutes= list(map(int,input().split()))


#일단 가장 큰걸 넣는다 
start = max(minutes) 

def binary_search(pl,pr):
    ans = -1
    while(pl<=pr):
        mid = (pl+pr)//2
        if(length_check(mid)):
            pr = mid-1
            ans = mid
        else:
            pl = mid+1
    print(ans)        


def length_check(length):
    temp_length = length
    idx = 0
    count = 1
    while(count<=m):
        if(temp_length >= minutes[idx]):
            temp_length -= minutes[idx]
            idx+=1
            if(idx >=len(minutes)):
                return True
        else:
            temp_length=length
            count+=1

    return False

binary_search(start,sum(minutes))
