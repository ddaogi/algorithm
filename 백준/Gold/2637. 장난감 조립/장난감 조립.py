import sys
from collections import defaultdict, deque

input = sys.stdin.readline

n = int(input())
m = int(input())

required_parts = [[] for row in range(n + 1)]
parts_required_count = [0] * (n + 1)
ea_list = [0] * (n + 1)
visited = [0] * (n + 1)
basic_products = []

for _ in range(m):
    product, part, ea = map(int, input().split())
    required_parts[product].append([part, ea])
    parts_required_count[part] += 1

while sum(parts_required_count) > 0:

    for product_id in range(1, n + 1):
        if not required_parts[product_id] and visited[product_id] == 0:
            basic_products.append(product_id)
            visited[product_id] = 1

        if parts_required_count[product_id] == 0 and visited[product_id] == 0:
            if ea_list[product_id] == 0:
                ea_list[product_id] = 1
            visited[product_id] = 1

            for part in required_parts[product_id]:
                ea_list[part[0]] += part[1] * ea_list[product_id]
                parts_required_count[part[0]] -= 1

for product_id in basic_products:
    print(product_id, ea_list[product_id], sep=" ")
