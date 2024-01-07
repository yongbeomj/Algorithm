import sys
from collections import deque

n = int(sys.stdin.readline()) # 학생 수
lines = deque(map(int, sys.stdin.readline().split()))
stack = []
target = 1

while lines:
    if lines[0] == target:
        lines.popleft()
        target += 1
    else:
        stack.append(lines.popleft())

    while stack:
        if stack[-1] == target:
            stack.pop()
            target += 1
        else:
            break

if not stack:
    print("Nice")
else:
    print("Sad")
