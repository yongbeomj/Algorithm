import heapq
import sys

n, h_centi, t = map(int, sys.stdin.readline().split())
heap = []

for _ in range(n):
    height = int(sys.stdin.readline())
    heapq.heappush(heap, -height)

count = 0
for _ in range(t):
    if -heap[0] == 1 or -heap[0] < h_centi:
        break
    else:
        h_giant = -heapq.heappop(heap)
        heapq.heappush(heap, -(h_giant // 2))
        count += 1

if -heap[0] < h_centi:
    print("YES")
    print(count)
else:
    print("NO")
    print(-heap[0])
