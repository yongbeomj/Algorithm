import sys

n = int(sys.stdin.readline())
stack = []

for _ in range(n):
    command = sys.stdin.readline().split()

    if command[0] == '1':
        stack.append(int(command[1]))
    elif command[0] == '2':
        if len(stack):
            print(stack.pop())
        else:
            print(-1)
    elif command[0] == '3':
        print(len(stack))
    elif command[0] == '4':
        if len(stack):
            print(0)
        else:
            print(1)
    else:
        if len(stack):
            print(stack[-1])
        else:
            print(-1)