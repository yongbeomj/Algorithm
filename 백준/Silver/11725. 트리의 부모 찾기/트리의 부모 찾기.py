import sys
sys.setrecursionlimit(10**8)

n = int(sys.stdin.readline())

# 노드 양방향 연결 정보 입력 및 저장
graphs = [[] for _ in range(n + 1)]

for _ in range(n - 1):
    node1, node2 = map(int, sys.stdin.readline().split())
    graphs[node1].append(node2)
    graphs[node2].append(node1)

# 부모 저장
parents = [0] * (n + 1)


# 부모 노드 탐색
def dfs(v):
    for i in graphs[v]:
        if not parents[i]:
            parents[i] = v
            dfs(i)


dfs(1)

for i in range(2, len(parents)):
    print(parents[i])