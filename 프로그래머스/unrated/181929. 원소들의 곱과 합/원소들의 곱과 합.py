def solution(num_list):
    answer = 0
    mult = 1
    sum2 = sum(num_list)
    for i in num_list:
        mult = i*mult
        
    if(mult < sum2*sum2 ):
    	answer=1
    return answer