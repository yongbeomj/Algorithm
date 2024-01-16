import sys
from collections import deque

input = sys.stdin.readline

t = int(input())
dx = [1, -1, 1, -1, 2, -2, 2, -2]
dy = [2, 2, -2, -2, 1, 1, -1, -1]


def bfs():
    matrix = [[0] * l for _ in range(l)]
    matrix[sx][sy] = 0
    dq = deque()
    dq.append((sx, sy))  # 시작점 추가

    while dq:
        x, y = dq.popleft()
        # 만약 현재 위치가 이동하려는 칸과 일치하다면 종료
        if x == ex and y == ey:
            return matrix[x][y]
        # 나이트가 이동할 수 있는 경우
        for i in range(8):
            nx = x + dx[i]
            ny = y + dy[i]
            # 탐색 좌표가 체스판 범위 내에 있고, 탐색이 안되어 있다면 탐색
            if 0 <= nx < l and 0 <= ny < l and matrix[nx][ny] == 0:
                dq.append((nx, ny))
                matrix[nx][ny] = matrix[x][y] + 1


for _ in range(t):
    l = int(input())
    sx, sy = map(int, input().split())  # 현재 위치
    ex, ey = map(int, input().split())  # 이동 종료 위치
    print(bfs())
