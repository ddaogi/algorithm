def find_parent(x, parent)
  if parent[x] != x
    parent[x] = find_parent(parent[x], parent)
  end
  parent[x]
end

def union(a, b, parent)
  a = find_parent(a, parent)
  b = find_parent(b, parent)
  if a < b
    parent[b] = a
  else
    parent[a] = b
  end
end

n, m = gets.split.map(&:to_i)

parent = Array.new(n + 1) { |i| i }

graph = []
m.times do
  graph << gets.split.map(&:to_i)
end

graph.sort_by! { |edge| edge[2] }

result = 0
max_cost = 0

graph.each do |edge|
  start, finish, cost = edge
  if find_parent(start, parent) != find_parent(finish, parent)
    union(start, finish, parent)
    result += cost
    max_cost = [cost, max_cost].max
  end
end

puts result - max_cost
