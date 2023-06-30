n = int(input())
num = n
for i in range(2,n+1):
    if i>num: break
    while(num % i == 0):
        num = num/i
        print(i)
    