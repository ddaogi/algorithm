import sys
input = sys.stdin.readline

def cal_distance(ani_x,ani_y,gun_x):
    if abs(gun_x - ani_x) + ani_y <= L:
        return True
    else:
        return False

def b_search(x,y):
    global cnt
    pl= 0
    pr= len(gun_x)-1

    while pl<=pr:
        pc = (pl+pr)//2 
        
        if cal_distance(x,y,gun_x[pc]): 
            cnt+=1
            # print(x,y,gun_x[pc])
            return 
        else:
            if gun_x[pc] > x :
                pr = pc-1
            else:
                pl = pc+1






M,N,L = map(int,input().split()) #사대 수 , 동물 수 , 총의 거리
gun_x = list(map(int,input().split()))
gun_x.sort()
animals = []
cnt = 0
for i in range(N):
    x,y = map(int,input().split())
    animals.append([x,y])



for xy in animals:
    x = xy[0]
    y = xy[1] 
    b_search(x,y)
    
print(cnt)
    