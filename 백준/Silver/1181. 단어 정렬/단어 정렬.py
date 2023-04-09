import sys
input = sys.stdin.readline

words = set([])
n = int(input())
for i in range (n):
    temp = input().rstrip()
    words.add(temp)

wordsList = list(words)


wordsList.sort()
# print(wordsList)
wordsList.sort(key=len)
for i in wordsList:
    print(i)