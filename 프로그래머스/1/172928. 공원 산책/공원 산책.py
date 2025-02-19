# 지나다니는길 O 
# 장애물 X
# 시작점 S

def solution(park, routes):
    direction = {"E":1, "S": 1, "W": -1, "N" :1}
    
    
    for i in range(len(park)):
        for j in range(len(park[i])):
            if park[i][j] == "S":
                cur_r, cur_c=(i,j)

    c,r = cur_c, cur_r
    for route in routes:
        way,distance = route.split()
        distance = int(distance)
        cur_c, cur_r = c,r
        while(distance >0):
            if way == "E":
                next_c = cur_c + 1
                next_r = cur_r
            elif way == "W":
                next_c = cur_c -1
                next_r = cur_r
            elif way == "N":
                next_r = cur_r -1
                next_c = cur_c
            else:
                next_r = cur_r + 1
                next_c = cur_c
            if (0 <= next_r <len(park)) and (0 <= next_c < len(park[next_r])) and park[next_r][next_c] != "X":
                cur_r, cur_c = next_r, next_c
            else:
                break
            distance-=1
            if distance == 0 :
                c = cur_c
                r = cur_r
            print(cur_r,cur_c)
    
    # print(start_r, start_c)
    answer = [r , c]
    return answer