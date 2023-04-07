inputA, inputB = input().split(" ")

reverseA = ''
reverseB = ''
for i in inputA:
    reverseA = i+reverseA
for i in inputB:
    reverseB = i + reverseB

numRA = int(reverseA)
numRB = int(reverseB)

print(max(numRA,numRB))


