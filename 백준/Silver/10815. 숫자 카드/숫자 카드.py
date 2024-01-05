n = int(input())
cards = list(map(int, input().split()))

m = int(input())
targets = list(map(int, input().split()))

dicts = {}
for i in cards:
    dicts[i] = 1

for j in targets:
    if j in dicts:
        print(1, end=' ')
    else:
        print(0, end=' ')
