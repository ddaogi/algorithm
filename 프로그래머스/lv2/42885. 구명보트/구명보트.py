
def solution(people, limit):
    dict = {}
    for i in range(241):
        dict[i] = 0
    for i in people:
        dict[i] +=1 
    # people.sort(reverse=1)
    answer = 0

    for i in people:
        if(dict[i] != 0):
            new_limit = limit-i 
            dict[i] -=1
            for j in range(new_limit,39,-1):
                if(dict[j] != 0): 
                    dict[j] -=1
                    break


            answer+=1
        

            
    return answer
            
    
    
