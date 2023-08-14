n= input()
str = input()
sum = 0
temp_sum = ""
for i in str:
    if(i.isdigit()):
        temp_sum+=i
    elif( temp_sum != ""):
        sum+=int(temp_sum)
        temp_sum=""

if(temp_sum!= ""):
    sum+=int(temp_sum)
print(sum)