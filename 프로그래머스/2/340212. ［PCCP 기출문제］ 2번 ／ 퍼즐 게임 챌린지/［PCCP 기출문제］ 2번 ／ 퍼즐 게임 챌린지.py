def solution(diffs, times, limit):
    def takes_time(time_cur, time_prev, diff, level):
        if diff <= level:
            return time_cur
        else:
            mistakes = diff - level
            return mistakes * (time_cur + time_prev) + time_cur

    def can_solve_with_level(level):
        total_time = 0
        for i in range(len(diffs)):
            prev_time = times[i - 1] if i > 0 else 0
            total_time += takes_time(times[i], prev_time, diffs[i], level)
            if total_time > limit:
                return False 
        return True  

    low, high = 1, max(diffs)
    answer = high

    while low <= high:
        mid = (low + high) // 2
        if can_solve_with_level(mid):
            answer = mid
            high = mid - 1
        else:
            low = mid + 1

    return answer
