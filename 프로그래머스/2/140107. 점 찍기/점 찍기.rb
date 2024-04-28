def solution(k, d)
  answer = 0
  
  (0..d).step(k) do |x|
    max_y = Math.sqrt(d**2 - x**2).to_i
    answer += (max_y / k) + 1
  end
  
  return answer
end
