
def solution(name, yearning, photo):
    answer = []
    list = [] 
    for i in range(len(name)):
        list.append([name[i],yearning[i]])
    
    result = [] 
    for j in range(len(photo)):
        result.append(0)
        for person in photo[j]:
            for i in range(len(list)):
                if(person == list[i][0]):
                    result[j]+= list[i][1] 
                    
    return result