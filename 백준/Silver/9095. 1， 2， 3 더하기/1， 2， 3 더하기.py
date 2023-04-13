# 정수 4를 1,2,3의 합으로 나타내는 방법

def recur(num): 
    if num == 1 : return 1
    elif num == 2 : return 2
    elif num == 3 : return 4
    else:
        return recur(num-1) + recur(num-2) + recur(num-3)


test_case = int(input())
ans_list = []
for i in range(test_case):
    input_num = int(input())
    ans_list.append(recur(input_num))

for i in ans_list:
    print(i)


