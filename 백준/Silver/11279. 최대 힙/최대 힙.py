import heapq
import sys

n = int(sys.stdin.readline())
heap = []

for _ in range(n):
    x = int(sys.stdin.readline())

    if x == 0:
        if len(heap):
            # heap 넣어줄 때 음수로 넣어줬으므로 출력할 때 다시 -1 곱해줌
            print(-(heapq.heappop(heap)))
        else:
            print(0)
    else:
        # heapq는 min heap만 지원
        # 숫자를 음수로 만들어서 최소힙 그대로 사용
        heapq.heappush(heap, -x)