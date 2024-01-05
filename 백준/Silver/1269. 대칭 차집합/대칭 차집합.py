import sys

a, b = map(int, sys.stdin.readline().split())
setA = set(map(int, sys.stdin.readline().split()))
setB = set(map(int, sys.stdin.readline().split()))

cnt1 = len(setA - setB)
cnt2 = len(setB - setA)
print(cnt1 + cnt2)
