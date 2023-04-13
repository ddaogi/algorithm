
num = input()

if(int(num)< 10):
    num+='0'
input = num
count = 0

while True:
    sum = 0
    last_num = ''
    for i in num:
        sum+= int(i)
        last_digit = i
    
    for j in str(sum):
        sum_last_digit = j 

    next = int(last_digit+ sum_last_digit)
    count+=1 

    if next == int(input):
        print(count)
        break

    num = str(next)
   


