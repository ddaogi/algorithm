import sys
input = sys.stdin.readline

equation = input().rstrip()

# 결과가 작으려면, -가 나오면 그 뒤를 다 마이너스로 만들수있다?
num = ""
minus_flag = False
result = 0
for i in equation:
    if '0'<=i<='9' : 
        num+= i
    else:
        if minus_flag:
            result -= int(num)
        else:
            result += int(num)
        if i == '-':
            minus_flag = True
        num = ""
if minus_flag: result-= int(num)
else: result+= int(num)

print(result)