num = int(input())
min = num
for i in range(num,0,-1):
    sum = i
    str_num = str(i)
    for j in str_num:
        sum+=int(j)
    if(sum == num):
        min = i
if(min == num): print(0)
else:
    print(min)