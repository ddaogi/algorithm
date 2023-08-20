def dfs(cur,depth,visited,nums):
    global results
    if(depth == 6):
        result = []
        for i in range(len(nums)):
            if(visited[i]):
                result.append(nums[i])
        results.append(result)
    for i in range(cur,len(nums)):
        if(not visited[i]):
            visited[i]= True
            dfs(i,depth+1,visited,nums)
            visited[i]=False



while(True):
    S = input()
    if(S == '0'): break
    nums = list(map(int,S.split()))
    k = nums[0]
    nums = nums[1:]
    results =[]
    visited = [False]*k

    dfs(0,0,visited,nums)
    for i in results:
        for j in i:
            print(j,end=' ')
        print()
    print()