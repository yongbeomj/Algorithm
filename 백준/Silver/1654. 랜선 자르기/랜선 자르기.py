import sys
input = sys.stdin.readline


def max_lan_length(lan_length_lst, target):
    start, end = 1, max(lan_length_lst)
    max_lenght = 0

    while start <= end:
        mid = (start + end) // 2  # 중간값
        lan_count = 0  # 랜선 개수

        # 랜선 각 길이로 만들수 있는 개수를 카운팅
        for length in lan_length_lst:
            lan_count += length // mid

        # 랜선 개수를 비교 조건으로 최소값이 될 때까지 탐색 범위 설정
        if lan_count >= target:
            max_lenght = mid
            start = mid + 1
        else:
            end = mid - 1

    return max_lenght


if __name__ == '__main__':
    k, n = map(int, input().split())  # 랜선 개수, 필요 랜선 개수
    lan_length = list(int(input()) for _ in range(k))  # 랜선 길이
    print(max_lan_length(lan_length, n))
