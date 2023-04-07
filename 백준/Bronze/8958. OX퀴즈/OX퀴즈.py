n = int(input())
ans = []
for i in range(n):
    temp = input()
    strings = list(temp)
    score =0
    add = 0
    for j in strings:
        if(j == 'O'):
            add += 1
            score += add
        else:
            add = 0
    ans.append(score)
for i in ans:
    print(i)


