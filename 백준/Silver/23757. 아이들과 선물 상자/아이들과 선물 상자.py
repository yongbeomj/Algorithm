import heapq
import sys

n, m = map(int, sys.stdin.readline().split())
gifts = list(map(int, sys.stdin.readline().split()))
wants = list(map(int, sys.stdin.readline().split()))

gift_heap = []
for i in gifts:
    heapq.heappush(gift_heap, -i)

isPresent = True
for wantCount in wants:
    giftCount = -heapq.heappop(gift_heap)

    if giftCount - wantCount < 0:
        isPresent = False
        break

    heapq.heappush(gift_heap, -(giftCount - wantCount))

if isPresent:
    print(1)
else:
    print(0)
