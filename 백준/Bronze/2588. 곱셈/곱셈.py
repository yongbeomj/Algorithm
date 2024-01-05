a = int(input())
b = int(input())

print(a * (b % 10))  # 1의 자리
print(a * ((b // 10) % 10))  # 10의 자리
print(a * ((b // 100) % 10))  # 100의 자리
print(a * b)