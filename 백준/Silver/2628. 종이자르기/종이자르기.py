x,y  = map(int,input().split(" "))

n = int(input())
garo = [0]
sero = [0]
for i in range(n):
    gs,length = map(int,input().split(" "))
    if gs == 0:
        garo.append(length)
    else:
        sero.append(length)

   
garo.append(y)
sero.append(x)
garo.sort()
sero.sort()
garo_diff = [0]
sero_diff = [0]

idx = 0
for i in garo:
    if idx!=0:
        garo_diff.append(i-prev)
    prev = i
    idx+=1

idx = 0
for i in sero:
    if idx!=0:
        sero_diff.append(i-prev)
    prev =i 
    idx+=1

print( max(garo_diff)*max(sero_diff))

