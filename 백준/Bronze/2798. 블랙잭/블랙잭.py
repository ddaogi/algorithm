
n,m = map(int,input().split())
card_num = list(map(int,(input().split())))
max = 0
for i in range(0,n-2):
    for j in range(i+1,n-1):
        for k in range(j+1,n):
            temp = card_num[i]+card_num[j]+card_num[k]
            if(max<=temp<=m):
                max = temp

print(max)