num = int(input())

def hanoi_print(N, start, to, via):

    if N == 1:
        print(start ,to)
    else:
        hanoi_print(N-1, start, via, to)
        print(start, to)
        hanoi_print(N-1, via, to, start)


print( 2**num -1)
if num<=20:
    hanoi_print(num,1,3,2)