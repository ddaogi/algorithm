from collections import deque
import sys
input = sys.stdin.readline

if __name__ =="__main__":
    n = int(input())
    dq = deque()
    ans_list = []
    for i in range(n): 
        input_str = list(input().split())
        
        # push 
        if input_str[0] == "push":
            num = int(input_str[1])
            dq.append(num)
        
        elif input_str[0] == "front":
            if dq: # 디큐가 있으면
                front = dq[0]
                ans_list.append(front)
            else:
                ans_list.append(-1)

        
        elif input_str[0] == "back":
            if dq:
                back = dq[-1] 
                ans_list.append(back)
            else:
                ans_list.append(-1)
        
        elif input_str[0] == "size":
            ans_list.append(len(dq))
        
        elif input_str[0] == "pop":
            if dq:
                ans_list.append(dq.popleft())
            else:
                ans_list.append(-1)

        elif input_str[0] == "empty":
            if dq:
                ans_list.append(0)
            else:
                ans_list.append(1)

    
    for ans in ans_list:
        print(ans)

        

        