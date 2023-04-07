ret = ''

def cal():
    global ret
    a,b = map(int,input().split(" "))
    ret = ret+str(a+b)+"\n"
    

n = int(input())
for i in range (n):
    cal()

print(ret)



