def solution(numbers, target):
    answer = 0
    

    def dfs(depth, total):
        if depth == len(numbers):
            if total == target:
                nonlocal answer
                answer += 1
            return
        if depth < len(numbers):
            dfs(depth+1, total+numbers[depth])
            dfs(depth+1, total-numbers[depth])
        
    dfs(0,0)
        
    return answer