import sys

n = int(sys.stdin.readline()) # 컴퓨터 수
m = int(sys.stdin.readline()) # edge 수
# 2차원배열 생성. 컴퓨터 수 만큼 인덱스 번호 생성
graph = [[] for _ in range(n+1)]

for _ in range(m):
    # 인접 노드 입력
    a, b = map(int, sys.stdin.readline().split())
    # 양방향이므로 2개 인덱스에 모두 삽입
    graph[a].append(b)
    graph[b].append(a)

# 바이러스 걸린 컴퓨터 배열 초기화
visited = [False] * (n + 1)

def dfs(idx):
    visited[idx] = True
    # 반복문으로 인접 컴퓨터 바이러스 여부가 false이면 재귀함수 호출해서 True로 값 변환
    for adj in graph[idx]:
        if not visited[adj]:
            dfs(adj)

dfs(1)
# visited 배열에서 True개수 -1 출력 (자기 자신은 제외해야하므로 -1)
print(visited.count(True) - 1)
