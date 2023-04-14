# 정수 K
from collections import deque


import sys 
input= sys.stdin.readline







if __name__ == "__main__" :
    num_list = []
    n = int(input())
    for i in range(n):
        num = int(input())
        if num == 0:
            num_list.pop()
        else:
            num_list.append(num)
        
    
    print(sum(num_list))
    
