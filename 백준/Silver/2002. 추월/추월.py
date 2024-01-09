import sys

# 차의 대수
n = int(sys.stdin.readline())

# 터널에 들어가는 차량
enter_cars = {}
for i in range(n):
    car = sys.stdin.readline().rstrip()
    enter_cars[car] = i

# 터널에서 나오는 차량
out_cars = []
for i in range(n):
    car = sys.stdin.readline().rstrip()
    out_cars.append(car)

# 처음에 나온 차량이 나중에 나온 차량보다 index가 크다면 추월 (인덱스 순서대로 들어갔으므로)
count = 0
for i in range(n - 1):
    for j in range(i + 1, n):
        if enter_cars[out_cars[i]] > enter_cars[out_cars[j]]:
            count += 1
            break

print(count)
