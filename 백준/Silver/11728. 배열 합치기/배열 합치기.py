n,m = map(int,input().split())
A = list(map(int,input().split()))
B = list(map(int,input().split()))

AB = A+B
AB.sort()
for i in AB:
    print(i,end=' ')