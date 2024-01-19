import sys
input = sys.stdin.readline


def max_budget_search(budget_lst):
    start, end = 0, max(budget_lst)
    max_budget = 0

    while start <= end:
        mid = (start + end) // 2  # 중간값
        total_budget = 0

        # 지방 예산 요청액에 따라 예산 추가
        for val in budget_lst:
            total_budget += min(val, mid)

        # 국가예산 총액 초과하지 않는 경우
        if total_budget <= m:
            max_budget = mid
            start = mid + 1  # 탐색 범위를 절반씩 줄임
        # 국가예산 총액 초과하는 경우
        else:
            end = mid - 1

    return max_budget


if __name__ == '__main__':
    n = int(input())  # 지방 수
    budget = sorted(list(map(int, input().split())))  # 예산 요청액
    m = int(input())  # 총 예산
    print(max_budget_search(budget))
