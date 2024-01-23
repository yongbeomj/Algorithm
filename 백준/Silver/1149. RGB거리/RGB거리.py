import sys
input = sys.stdin.readline

n = int(input())
rgb_cost = []
for _ in range(n):
    rgb_cost.append(list(map(int, input().rstrip().split())))

for i in range(1, n):
    rgb_cost[i][0] = min(rgb_cost[i - 1][1], rgb_cost[i - 1][2]) + rgb_cost[i][0]
    rgb_cost[i][1] = min(rgb_cost[i - 1][0], rgb_cost[i - 1][2]) + rgb_cost[i][1]
    rgb_cost[i][2] = min(rgb_cost[i - 1][0], rgb_cost[i - 1][1]) + rgb_cost[i][2]

print(min(rgb_cost[n - 1]))
