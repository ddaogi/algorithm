str = input()

token = input()


stack = []
for i in range(0,len(str)):
    stack.append(str[i])
    # print(str[-2])
    # print(stack)
    # if(len(stack)>=len(token)):
    #     print(stack[-len(token):])
    while(len(stack)>=len(token) and ''.join(stack[-len(token):]) == token):
        # print(stack)
        for i in range(0,len(token)):
            stack.pop()


if(len(stack)== 0 ):
    print("FRULA")
else:
    stack= ''.join(stack)
    print(stack)