def solution(N, number):
    if N == number:
        return 1
    

    
    dp = [[],[N]]

    for i in range(2,9):
        dpi = []
        for j in range(1, i):
            for a in dp[j]:
                for b in dp[i-j]:
                    dpi.append(a+b)
                    dpi.append(a-b)
                    dpi.append(a*b)
                    if b != 0 :
                        dpi.append(a//b)
        dpi.append(int(str(N) * i))  # 수 이어붙이기

        dpi = list(set(dpi))
        dp.append(dpi)

        if number in dpi:
            return i

    

    return -1