def fact(n):
    if(n>1):
        return n*fact(n-1)
    elif n==0:
        return 1
    else: 
        return n
num = int(input())

print(fact(num))
