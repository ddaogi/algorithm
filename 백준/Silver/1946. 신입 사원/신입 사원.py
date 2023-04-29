import sys
input=  sys.stdin.readline

t=  int(input())

for _ in range (t):
    n = int(input())
    ranks=[]
    for i in range(n):
        ranks.append(list(map(int,input().rstrip().split())))
    
    ranks.sort()
    prev = 100001
    first_cnt = 0
    for rank in ranks:
        # print(rank, first_cnt )
        if rank[1] < prev: # 새로들어온 rank가 순위가 더 높으면 
            prev = rank[1]
            first_cnt+=1
    # print(first_cnt)

    ranks.sort(key=lambda x : x[1])    
    prev = 100001
    second_cnt = 0
    for rank in ranks:
        if rank[0] < prev:
            prev = rank[0]
            second_cnt+=1
    print(max(first_cnt,second_cnt))
    
