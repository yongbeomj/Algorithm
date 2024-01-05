import sys

n, m = map(int, sys.stdin.readline().split())

dict = {}
for i in range(1, n + 1):
    pocketmon = sys.stdin.readline().rstrip()
    dict[pocketmon] = i
    dict[i] = pocketmon

for j in range(m):
    target = sys.stdin.readline().rstrip()
    if target.isdigit():
        print(dict[int(target)])
    else:
        print(dict[target])
