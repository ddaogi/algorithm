
# N 정수의 개수   1<=n <=20
# 목표 합 S 
def dfs(idx, sum) :
	global count
	if idx == n:
		return
	if sum+ num_list[idx] == s:
		count+=1
	
    #들어온 index 포함x
	dfs(idx+1,sum)
	
    #들어온 index 포함
	dfs(idx+1, sum+num_list[idx])

n,s = map(int,input().split(" "))
num_list = list(map(int,input().split()))
count = 0
dfs(0,0)

print(count)