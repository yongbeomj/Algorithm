import sys
from collections import deque

n = int(sys.stdin.readline())
card_deck = deque(i for i in range(1, n+1))

while card_deck:
    if len(card_deck) == 1:
        break

    card_deck.popleft() # 카드 버림
    card_deck.append(card_deck.popleft()) # 첫번째 숫자 뒤로

print(card_deck[0])
