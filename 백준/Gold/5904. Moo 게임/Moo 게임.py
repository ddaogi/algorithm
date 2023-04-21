N = int(input())

def moo(acc, cur, N):
    prev = (acc-cur)//2
    if N <= prev:
        return moo(prev, cur-1, N)
    elif N > prev+cur: 
        return moo(prev, cur-1, N-prev-cur)
    else:
        if N-prev-1:
            return "o" 
        else:
            return "m"

acc, n = 3, 0
while N > acc:
    n += 1
    acc = acc*2+n+3

print(moo(acc, n+3, N))