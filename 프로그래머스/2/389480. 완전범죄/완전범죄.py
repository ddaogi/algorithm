from collections import deque

def solution(info, n, m):
    queue = deque([(0, 0, 0)]) # a 흔적, b흔적, 인덱스
    visited = set()
    visited.add((0, 0))

    a_trace_list = []
    while queue:
        a_trace, b_trace, idx = queue.popleft()

        if idx == len(info):
            a_trace_list.append(a_trace)
            continue
            
            # return a_trace

        a_next = (a_trace + info[idx][0], b_trace, idx + 1)
        b_next = (a_trace, b_trace + info[idx][1], idx + 1)
        
        if b_next[1] < m and b_next not in visited:
            queue.append(b_next)
            visited.add(b_next)
                    
        if a_next[0] < n and a_next not in visited:
            queue.append(a_next)
            visited.add(a_next)

        
    if a_trace_list:
        return min(a_trace_list)
        
    return -1 
