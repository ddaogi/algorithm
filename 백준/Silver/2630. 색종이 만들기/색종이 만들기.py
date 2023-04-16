import sys
input = sys.stdin.readline
white = 0 
blue = 0
def cut(x,y,n):
    global white,blue
    color = arr[x][y] 
    for i in range(x,x+n):
        for j in range(y,y+n):
            if arr[i][j] != color:
                cut(x      , y     , n//2)
                cut(x+ n//2, y     , n//2)
                cut(x      , y+n//2, n//2)
                cut(x+ n//2, y+n//2, n//2)
                return
    
    if color == 1:
        blue+=1
    else:
        white+=1


if __name__ == "__main__":
    n= int(input()) 
    arr = [[0] * n for _ in range(n)]
    for i in range(n):
        temp = list(map(int,input().split()))
        arr[i] = temp
    cut(0,0,n)
    print(white)
    print(blue)