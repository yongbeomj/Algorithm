n = int(input())

company_log = {}
for _ in range(n):
    name, exit_log = input().split()
    if exit_log == "enter":
        company_log[name] = exit_log
    else:
        del company_log[name]

result = sorted(company_log, reverse=True)
for i in result:
    print(i)
