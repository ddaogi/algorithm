def solution(weights):
    cal = [3/2,4/2,4/3]
    answer = 0
    weights.sort()
    dict ={}
    
    for weight in range(100,1001):
        dict[weight] = 0
    for i in weights:
        dict[i] = dict[i] +1
    
    for i in weights:
        answer+= count_comb(dict[i])
        for k in cal:
            if i*k == int(i*k) and i*k <=1000:
                answer+=dict[i*k]
                # print(i,k,dict[i*k])
        dict[i] = 0
                
    return answer

def count_comb(num):
    if num == 1 or num ==0:
        return 0
    else:
        return num*(num-1)/2
   