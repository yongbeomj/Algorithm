from collections import deque

for _ in range(int(input())):
    N, M = map(int, input().split())
    queue = deque(map(int, input().split()))
    index = [0 for _ in range(N)]
    index[M] = 1
    cnt = 0
    while 1:
        if queue[0] == max(queue):
            if index[0] == 1:
                break
            else:
                queue.popleft()
                index.pop(0)
                cnt += 1
        else:
            queue.append(queue.popleft())
            index.append(index.pop(0))
    print(cnt+1)