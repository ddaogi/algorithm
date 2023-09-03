#RT, CF, JM, AN
def solution(survey, choices):
    answer = ''
    R = 0
    C = 0
    J = 0
    A = 0
    idx = 0
    for i in survey:
        if(i[0] == "R"):
            R=R+choices[idx]-4
        elif(i[1] == "R"):
            R=R-choices[idx]+4
        elif(i[0] == "C"):
            C=C+choices[idx]-4
        elif(i[1] == "C"):
            C=C-choices[idx]+4
        elif(i[0] == "J"):
            J=J+choices[idx]-4
        elif(i[1] == "J"):
            J=J-choices[idx]+4            
        elif(i[0] == "A"):
            A=A+choices[idx]-4
        elif(i[1] == "A"):
            A=A-choices[idx]+4
        idx +=1 
    if(R<=0):
            answer+="R"
    else:
            answer+="T"
    if(C<=0):
        answer+="C"
    else:
        answer+="F"
    if(J<=0):
        answer+="J"
    else:
        answer+="M"
    if(A<=0):
        answer+="A"
    else:
        answer+="N"

    print(R,C,J,A)
    return answer
