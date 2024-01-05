from collections import Counter

n = int(input())
numbers = Counter(map(int, input().split())) # 딕셔너리로 변환

m = int(input())
targets = map(int, input().split())

for num in targets:
    if num in numbers:
        print(1)
    else:
        print(0)
