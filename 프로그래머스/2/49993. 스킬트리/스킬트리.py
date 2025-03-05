from collections import deque
def solution(skill, skill_trees):
    answer = 0
    # skill= list(skill)
    print(deque(skill))
    for i in range(len(skill_trees)):
        queue = deque(skill)
        skill_learned = True
        for ch in skill_trees[i]:
            if ch in queue and queue[0] != ch:
                skill_learned = False
                break
            if queue[0] == ch:
                queue.popleft()
            if len(queue) == 0:
                break
        if skill_learned:
            print(skill_trees[i])
            answer+=1
        
    return answer