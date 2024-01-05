import sys

n, m = map(int, sys.stdin.readline().split())

noListenDics = set()
for _ in range(n):
    noListenDics.add(sys.stdin.readline().rstrip())

noWatchDics = set()
for _ in range(m):
    noWatchDics.add(sys.stdin.readline().rstrip())

result = list(sorted(noListenDics & noWatchDics))

print(len(result)) # 듣보잡 수
[print(i) for i in result] # 명단
