import sys
input = sys.stdin.readline

n = int(input())
members = []
for _ in range(n):
    age, name = map(str, input().split())
    members.append((int(age), name))

# members 리스트의 각 요소에서 0번째 인덱스를 기준으로 정렬
members.sort(key=lambda x:int(x[0]))

for member in members:
    print(member[0], member[1])
