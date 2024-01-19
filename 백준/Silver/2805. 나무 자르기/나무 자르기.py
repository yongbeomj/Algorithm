import sys
input = sys.stdin.readline


def max_setting_height(tree_height_lst, target):
    start, end = 1, max(tree_height_lst)
    max_height = 0

    while start <= end:
        mid = (start + end) // 2  # 중간값 (세팅값)
        total_log_tree = 0  # 벌목된 나무 총합

        # 나무 높이가 중간값보다 크다면 벌목 높이만큼 합해줌
        for height in tree_height_lst:
            if height > mid:
                total_log_tree += height - mid

        if total_log_tree >= target:
            max_height = mid
            start = mid + 1
        else:
            end = mid - 1

    return max_height


if __name__ == '__main__':
    n, m = map(int, input().split())  # 나무 수, 필요한 나무 길이
    tree_height = sorted(list(map(int, input().split())))  # 나무 높이 
    print(max_setting_height(tree_height, m))
