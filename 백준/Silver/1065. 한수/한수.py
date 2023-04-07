

str_num = input()



count = 0
def is_hansoo(str_num):
    prev = 1001
    prev_diff = 1001
    diff = 1001
    for i in str_num:
        
        #다를경우 
        if prev== 1001 :
            prev = int(i)
        else:
         
            diff = int(i) - int(prev)

        
        if prev_diff != 1001 and diff != prev_diff :
            return False
        prev_diff = diff
        prev = i
        
    return True
    


if(int(str_num) < 100):
    res = int(str_num)
else:
    for i in range(100,int(str_num)+1):
        if is_hansoo(str(i)):
            count+=1
    res = 99+count

print(res)
   

