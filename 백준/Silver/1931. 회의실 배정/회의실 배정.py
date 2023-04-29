import sys
input = sys.stdin.readline

n=int(input())
times = []
for i in range(n):
    s,e = map(int,input().split())
    times.append([s,e])

times.sort(key=lambda x : (x[1],x[0]))
cur_etime = 0
cnt=0
for time in times:
    new_stime,new_etime = time[0],time[1]
    if new_stime >= cur_etime:
        # print(cur_etime,  new_stime, new_etime)
        cur_etime = new_etime
        cnt+=1
    

print(cnt)

        

    
