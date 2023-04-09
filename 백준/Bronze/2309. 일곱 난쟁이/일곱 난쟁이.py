numList = []
for i in range(9):
    numList.append( int(input()))

mySum = sum(numList)

numList.sort()
for i in range(9):
    for j in range(9):
        if i == j : continue
        if mySum - numList[i] - numList[j] == 100:
            except1 = i
            except2 = j             
            break 
    if mySum - numList[i] - numList[j] == 100:
        break

for i in numList:
    if i != numList[except1] and i != numList[except2]:
        print(i)


            
        
        