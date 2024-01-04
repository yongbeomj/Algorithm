from collections import deque

t = int(input())  # 테스트 케이스 개수
for _ in range(t):
    # n : 문서 개수, m : 몇 번째로 인쇄되는지
    n, m = map(int, input().split())
    # 문서 입력 받아서 공백을 기준으로 데크 삽입
    queue = deque(map(int, input().split()))
    index = [0 for _ in range(n)]
    index[m] = 1
    cnt = 0
    
    while True:
        # 첫번째 값 중요도가 최대일 경우
        if queue[0] == max(queue):
            if index[0] == 1:
                break
            else:
                queue.popleft()
                index.pop(0)
                cnt += 1

        # 첫번째 값이 중요도가 최대가 아닐 경우
        else:
            queue.append(queue.popleft()) # 첫번째 값을 가장 뒤로 재배치 (popleft)
            index.append(index.pop(0))

    print(cnt + 1)