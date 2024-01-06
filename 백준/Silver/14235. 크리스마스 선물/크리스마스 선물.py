import heapq
import sys

n = int(sys.stdin.readline()) # 방문 횟수
heap = []

for _ in range(n):
    a = list(map(int, sys.stdin.readline().split()))
    if a[0] == 0:
        if len(heap):
            print(-heapq.heappop(heap))
        else:
            print(-1)
    else:
        for i in range(1, len(a)):
            heapq.heappush(heap, -a[i])
