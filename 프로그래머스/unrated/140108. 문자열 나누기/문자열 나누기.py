def solution(s):
  x = s[0]
  same = 1
  diff = 0
  count = 1
  for i in range(1,len(s)-1):
    if(x == s[i]): same+=1
    else: diff+=1

    if(same == diff):
      count+=1
      x=s[i+1]
      i+=1
 
  
  return count