import sys
from collections import deque

# 테스트 케이스 개수 입력
n = int(sys.stdin.readline())

for _ in range(n):
    input_str = sys.stdin.readline().rstrip()
    left = deque()
    right = deque()

    for ch in input_str:
        if ch == "<":
            if left:
                right.appendleft(left.pop())
        elif ch == ">":
            if right:
                left.append(right.popleft())
        elif ch == "-":
            if left:
                left.pop()
        else:
            left.append(ch)

    left.extend(right)
    print(''.join(left))
    