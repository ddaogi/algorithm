import math
def isPrime(num):
    if num == 1:
        return False
    for i in range(2,num):
        if num%i == 0:
            return False
        if( i > math.sqrt(num)): break

    return True

n = int(input())
numList = list(map(int,input().split(" ")))
count =0
for i in numList:
    if isPrime(i):
        count+=1

print(count)
