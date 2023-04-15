from collections import deque

cards = deque()
n = int(input())
# for i in range(n,0,-1):
    # cards.append(i)
for i in range(1,n+1):
    cards.append(i)

# print(cards)

while len(cards) != 1:
    cards.popleft()
    cards.append(cards.popleft())

# print(cards)
print(cards[0])