import heapq
import sys

n = int(sys.stdin.readline())
abs_heap = []

for i in range(n):
    x = int(sys.stdin.readline())

    if x == 0:
        if len(abs_heap):
            print(heapq.heappop(abs_heap)[1])
        else:
            print(0)
    else:
        heapq.heappush(abs_heap, (abs(x), x))
