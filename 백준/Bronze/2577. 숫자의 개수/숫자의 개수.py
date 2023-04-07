
arr = [0] * 10

a = int(input())
b= int(input())
c = int(input())

result = str(a*b*c)

for i in result:
    arr[int(i)] += 1

for i in arr:
    print(i)




