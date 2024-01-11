import sys
from collections import deque

n, m, v = map(int, sys.stdin.readline().split())
graph = [[0] * (n + 1) for _ in range(n + 1)]

# 연결된 정점 입력
for _ in range(m):
    x, y = map(int, sys.stdin.readline().split())
    graph[x][y] = graph[y][x] = 1

# dfs, bfs 방문 여부
dfs_visited = [0] * (n + 1)
bfs_visited = [0] * (n + 1)

def dfs(v):
    dfs_visited[v] = 1
    print(v, end=" ")
    for i in range(1, n + 1):
        # 아직 방문하지 않았고, 정점이 연결되어있다면 재귀함수 호출
        if dfs_visited[i] == 0 and graph[v][i] == 1:
            dfs(i)

def bfs(v):
    queue = deque()
    queue.append(v)
    bfs_visited[v] = 1
    while queue:
        v = queue.popleft()
        print(v, end = " ")
        for i in range(1, n + 1):
            if bfs_visited[i] == 0 and graph[v][i] == 1:
                queue.append(i)
                bfs_visited[i] = 1

dfs(v)
print()
bfs(v)
