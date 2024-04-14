require 'set'

def solution(x, y, n)
  queue = [[x, 0]]
  visited = Set.new
  until queue.empty?
    i, j = queue.shift
    next if i > y || visited.include?(i)
    
    visited.add(i)
    return j if i == y
    
    [i * 3, i * 2, i + n].each do |k|
      queue.push([k, j + 1]) if k <= y && !visited.include?(k)
    end
  end
  -1
end