import sys

input = sys.stdin.readline

curr_hour, curr_min = map(int, input().split())  # 현재 시간
cooking_min = int(input())  # 요리에 필요한 시간

# 요리 끝나는 시간 시, 분 계산
fin_hour = curr_hour + (curr_min + cooking_min) // 60
fin_min = (curr_min + cooking_min) % 60

if fin_hour >= 24:
    fin_hour = fin_hour - 24

print(fin_hour, fin_min)
