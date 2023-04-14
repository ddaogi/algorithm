import sys
input = sys.stdin.readline

n = int(input())
input_list = []
for i in range(n):
    input_list.append(int(input()))

last_height = input_list.pop()
count = 1
while len(input_list) != 0:
    temp = input_list.pop()
    if temp > last_height:
        last_height =temp 
        count+=1

print(count)