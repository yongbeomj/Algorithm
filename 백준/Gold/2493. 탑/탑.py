import sys

n = int(sys.stdin.readline())  # 탑의 수
top_heights = list(map(int, sys.stdin.readline().split()))  # 탑 높이
stack = []
result = []

for i in range(n):
    # 가장 첫번째 탑부터 순서대로 비교
    target = top_heights[i]

    while stack and top_heights[stack[-1]] < target:
        stack.pop()

    if stack:
        cnt = stack[-1] + 1
    else:
        cnt = 0

    result.append(cnt)
    stack.append(i)

print(*result)
