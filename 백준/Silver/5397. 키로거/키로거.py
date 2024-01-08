import sys
from collections import deque

# 테스트 케이스 개수 입력
n = int(sys.stdin.readline())

for _ in range(n):
    # 문자열 입력
    input_str = sys.stdin.readline().rstrip()
    # 커서를 기준으로 left, right 리스트 구분
    left = []
    right = deque()

    # 문자열 개수만큼 반복
    for ch in input_str:
        # 입력이 "<" 이고 left 리스트에 요소가 있다면 left.pop() 후 pop 요소를 right.appendleft()
        if ch == "<":
            if left:
                right.appendleft(left.pop())
        # 입력이 ">" 이고 right 리스트에 요소가 있다면 right.pop() 후 pop 요소를 left.append()
        elif ch == ">":
            if right:
                left.append(right.popleft())
        # 입력이 "-" 이고 left 리스트에 요소가 있다면 left.pop()
        elif ch == "-":
            if left:
                left.pop()
        # 그 외 입력은 left 리스트에 추가
        else:
            left.append(ch)

    # left와 right 리스트 순서대로 출력
    left.extend(right)
    print("".join(left))
