import sys
start, end = map(int, sys.stdin.readline().split())
primes = []
for i in range(start, end+1):
    is_prime = True
    if i == 1 : continue
    for j in range(2, int(i**0.5) + 1):
        if i % j == 0:
            is_prime = False
            break
    if is_prime:
        primes.append(i)
print(*primes, sep='\n') 
