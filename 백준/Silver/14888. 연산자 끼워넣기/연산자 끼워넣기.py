import math

n=int(input())
lst=list(map(int,input().split()))
plus,minus,multi,div=map(int,input().split())

max_result,min_result=-math.inf, math.inf

def dfs(idx,result,plus, minus, multi, div):
  global max_result, min_result
  if idx==n:
    max_result=max(max_result,result)
    min_result=min(min_result,result)
    return

  if plus:
    dfs(idx+1,result+lst[idx],plus-1, minus, multi, div)
  if minus:
    dfs(idx+1,result-lst[idx],plus, minus-1, multi, div)
  if multi :
    dfs(idx+1,result*lst[idx],plus, minus, multi-1, div)
  if div :
    dfs(idx+1, -1*(-1*result//lst[idx]) if result<0 else result//lst[idx], plus, minus, multi, div-1)


dfs(1,lst[0],plus,minus,multi,div)
print(max_result)
print(min_result)