import sys

input = sys.stdin.readline

t = int(input())  # 테스트케이스 수

for _ in range(t):
    n = int(input())  # 전화번호 수
    contacts = [input().rstrip() for _ in range(n)]  # 전화번호
    contacts.sort()

    result = True
    for i in range(n - 1):
        # 두 번호 중 짧은 번호 길이까지만 비교해서 같으면 false
        # 번호 앞 부분이 다른 번호와 같으면 끝까지 누르기 전에 다른 번호가 걸림
        if contacts[i] == contacts[i + 1][:len(contacts[i])]:
            result = False
            break

    if result:
        print("YES")
    else:
        print("NO")
