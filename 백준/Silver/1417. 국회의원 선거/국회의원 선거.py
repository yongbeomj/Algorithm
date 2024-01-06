import heapq
import sys

n = int(sys.stdin.readline())  # 후보 수
heap = []

for i in range(n):
    m = int(sys.stdin.readline())
    if i == 0:
        dasom = m
        continue

    # 최대 힙으로 만들어줌
    heapq.heappush(heap, -m)

count = 0
while heap:
    vote = -heapq.heappop(heap) # 후보 득표수
    # 다솜 득표수가 다른 후보 득표수보다 많으면 반복문 종료
    if dasom > vote:
        break

    heapq.heappush(heap, -(vote - 1))
    dasom += 1
    count += 1

print(count)
