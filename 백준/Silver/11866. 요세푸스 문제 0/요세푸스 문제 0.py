import sys
from collections import deque

n, k = map(int, sys.stdin.readline().split())
people = deque(i for i in range(1, n + 1))
result = []

while people:
    for _ in range(k - 1):
        people.append(people.popleft()) # k번째까지 뒤로 이동

    result.append(people.popleft()) # k번째 사람 제거

print(f"<{', '.join(str(i) for i in result)}>")
