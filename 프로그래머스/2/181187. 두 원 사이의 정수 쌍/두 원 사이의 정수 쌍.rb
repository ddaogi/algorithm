def solution(r1, r2)
    quar = 0
    for i in 0...r1
        quar += Math.sqrt(r2**2 - i**2).to_i - Math.sqrt(r1**2 - i**2 - 1).to_i
    end
    for i in r1...r2
        quar += Math.sqrt(r2**2 - i**2).to_i
    end
    return quar * 4
end