n, m = map(int, input().split())

strDict = set()
count = 0
for _ in range(n):
    strDict.add(input())

for _ in range(m):
    checkStr = input()
    if checkStr in strDict:
        count += 1

print(count)
