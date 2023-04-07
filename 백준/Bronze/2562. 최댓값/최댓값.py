max = 0
maxIdx = 0
inputList = []
for i in range(9):
    inputNum= int(input())
    inputList.append(inputNum)
 
for i in range(9):
    if inputList[i]>max:
        max = inputList[i]
        maxIdx = i+1
print(max)
print(maxIdx)