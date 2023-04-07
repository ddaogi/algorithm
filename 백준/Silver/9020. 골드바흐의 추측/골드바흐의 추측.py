import math
import time
primeList = []

ans_list = []
def isPrime(num):

    if num ==2: return True
    if num % 2 == 0 :
        return False
    for i in range(3, int(math.sqrt(num))+1, 2):
        if num % i == 0:
            return False

    return True

#여기에서 시간소요 심함
def find_two(num):
   
    

    low = 0
    high = 0
    for i in primeList:
        if i >= (num/2):
            if (num-i) in primeList:
                high= i
                low = num-i
                break

    ans_list.append([low,high])

    return



for i in range(2, 10001):
    if isPrime(i):
        primeList.append(i)
  

#입력받는곳

n= int(input())
for i in range(n):
    
    num = int(input())
    # start=time.time()

    find_two(num)
    # print("time :", time.time() - start)  # 현재시각 - 시작시간 = 실행 시간




for i in ans_list:
    print(f'{i[0]} {i[1]}')