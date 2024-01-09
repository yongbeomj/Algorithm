import heapq
import sys

# n: 카드 개수, m: 카드 합체 횟수
n, m = map(int, sys.stdin.readline().split())
# 카드 초기 상태
cards = list(map(int, sys.stdin.readline().split()))

# heap 변환
heapq.heapify(cards)

for _ in range(m):
    # 가장 작은 값 2개 추출
    x = heapq.heappop(cards)
    y = heapq.heappop(cards)

    # 2개 더한 값을 다시 삽입
    heapq.heappush(cards, x + y)
    heapq.heappush(cards, x + y)

# 리스트에 있는 값 모두 합해서 출력
print(sum(cards))
