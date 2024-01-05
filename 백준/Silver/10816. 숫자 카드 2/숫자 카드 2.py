import sys
from collections import Counter

n = int(sys.stdin.readline())
cards = Counter(map(int, sys.stdin.readline().split()))

m = int(sys.stdin.readline())
targets = list(map(int, sys.stdin.readline().split()))

for num in targets:
    if num in cards:
        print(cards[num], end=' ')
    else:
        print(0, end=' ')
