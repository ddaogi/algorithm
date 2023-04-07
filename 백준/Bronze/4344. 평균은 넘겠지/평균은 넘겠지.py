n = int(input())
ans = []
for i in range(n):
    line = list(map(int,input().split(" ")))
    totalScore = 0
    peopleCount =line[0]
    tempList = []
    for j in range(1,line[0]+1):
        totalScore+= line[j]
        tempList.append(line[j])
        
    avg = totalScore/peopleCount
    count = 0
    for j in tempList:
        if j>avg:
            count+=1

    ans.append(count/peopleCount)


for i in ans:
    print("%0.3f%%" % (i*100))
    


