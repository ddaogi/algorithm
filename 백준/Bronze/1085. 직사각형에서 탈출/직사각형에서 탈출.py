x,y,w,h = map(int,input().split(" "))

# 한수의 위치 x,y

# 직사각형 좌표 (0,0) (w,0) (0,h) (w,h)
# 4가지경우만 비교하면됨
#  

print(min(x-0, w-x , h-y, y-0))