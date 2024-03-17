def solution(sequence, k)
  l = 0
  r = 0
  answer = [0, sequence.length]
  sum = sequence[0]

  loop do
    if sum < k
      r += 1
      break if r == sequence.length
      sum += sequence[r]
    else
      if sum == k
        answer = [l, r] if r - l < answer[1] - answer[0]
      end
      sum -= sequence[l]
      l += 1
    end
  end

  answer
end