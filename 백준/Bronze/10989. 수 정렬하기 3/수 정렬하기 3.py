import sys
input=sys.stdin.readline

numArr = [0] * 10001

n = int(input())
for i in range (n):
    temp = int(input())
    numArr[temp] += 1

for i in range(10001):
    for j in range(numArr[i]):
        print(i)


