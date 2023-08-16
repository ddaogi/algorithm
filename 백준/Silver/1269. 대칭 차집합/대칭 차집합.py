from collections import defaultdict
numA, numB = map(int, input().split())
A = list(map(int,input().split()))
B = list(map(int,input().split()))
count = 0
dict = defaultdict(int)
for i in B:
    dict[i] =1

# print(dict)
    
for i in A:
    if dict[i] == 1:
        count+=1
    
print(len(A)+len(B)-count-count)