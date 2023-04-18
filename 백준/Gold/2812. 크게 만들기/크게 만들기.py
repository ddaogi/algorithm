import sys
input = sys.stdin.readline
N, K = map(int, input().split())
nums = list(input())
k, stack = K, []
for i in range(N):
    while k > 0 and stack and stack[-1] < nums[i]:
        stack.pop()
        k -= 1
    stack.append(nums[i])
print(''.join(stack[:N-K]))