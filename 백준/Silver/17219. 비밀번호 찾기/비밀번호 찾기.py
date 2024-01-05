n, m = map(int, input().split())
pwDics = {}

for _ in range(n):
    sites, ps = input().split()
    pwDics[sites] = ps

for _ in range(m):
    print(pwDics[input()])