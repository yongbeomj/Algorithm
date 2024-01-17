from collections import Counter
import sys
input = sys.stdin.readline

n = int(input())
numbers = [int(input()) for _ in range(n)]
numbers.sort()

# 산술평균
print(round(sum(numbers) / n))

# 중앙값
print(numbers[n // 2])

# 최빈값
if n > 1:
    # 리스트 각 요소 별로 빈도수를 value로 딕셔너리 생성
    num_dic = Counter(numbers).most_common()
    # 첫번째 요소와 두번째 요소 빈도수가 같다면 두번째, 아닐경우 첫번째 요소 출력
    if num_dic[0][1] == num_dic[1][1]:
        print(num_dic[1][0])
    else:
        print(num_dic[0][0])
else:
    print(numbers[0])

# 범위
print(numbers[n-1] - numbers[0])
