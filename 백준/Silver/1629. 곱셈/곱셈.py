a,b,c = map(int,input().split())


# A^B %C 
def rec(a,b,c):
    if b == 1 :
        return a%c 
    if b % 2 == 0:
        return rec(a,b//2,c)**2 % c
    else:
        return rec(a,b//2,c)**2*a % c
    
print(rec(a,b,c))