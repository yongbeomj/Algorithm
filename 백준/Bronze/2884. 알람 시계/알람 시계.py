import sys

input = sys.stdin.readline

h, m = map(int, input().split())

if m - 45 < 0:
    if h == 0:
        h = 23
    else:
        h -= 1

    m = 60 - (45 - m)

    print(h, m)
else:
    print(h, m - 45)
