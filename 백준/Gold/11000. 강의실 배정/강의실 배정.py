import heapq
import sys
input = sys.stdin.readline

n = int(input())
times = []
for _ in range(n):
    times.append(list(map(int, input().split())))

times.sort()

# 루트 노드 설정
heap = []
heapq.heappush(heap, times[0][1])

for i in range(1, n):
    # 가장 빠른 수업 종료 시간보다 다음 수업 시작 시간이 느리면
    if heap[0] <= times[i][0]:
        # 기존 수업에 이어서 진행 가능하므로 pop
        heapq.heappop(heap)
    # 신규 수업 생성
    heapq.heappush(heap, times[i][1])

print(len(heap))
