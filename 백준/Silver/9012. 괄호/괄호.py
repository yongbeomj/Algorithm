t = int(input()) # 테스트 데이터 개수

for i in range(t):
    vpsList = list(input())
    res = 0

    for j in range(len(vpsList)):
        if vpsList[j] == "(":
            res += 1
        else:
            res -= 1

        if res < 0:
            print("NO")
            break

    if res > 0:
        print("NO")
    elif res == 0:
        print("YES")

