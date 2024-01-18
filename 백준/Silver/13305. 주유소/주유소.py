import sys
input = sys.stdin.readline

n = int(input())
road_lengths = list(map(int, input().split()))
gas_prices = list(map(int, input().split()))

# 최소값은 시작점 주유소 가격으로 시작 (시작점에서 반드시 주유가 필요하므로)
min_price = gas_prices[0]
result = 0
for i in range(n - 1):
    # 현재 지점 주유소 가격이 최소값보다 작으면 최소값 변경
    if min_price > gas_prices[i]:
        min_price = gas_prices[i]
    # 도시가 변경될 때마다 필요량 주유 (주유소 최소값이 변경될 수 있으므로)
    result += min_price * road_lengths[i]

print(result)
