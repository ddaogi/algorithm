n = int(input())
ret = ''
for i in range(n):
    num,string= input().split(" ")

    num = int(num)
    for j in string:
        for k in range(num):
            ret+=j
    
    ret += '\n'

print(ret)

