import sys

while True:
    sentence = sys.stdin.readline().rstrip()
    stack = []
    isStr = True

    if sentence == '.':
        break

    for ch in sentence:
        if ch == '[' or ch == '(':
            stack.append(ch)
        elif ch == ']':
            if stack and stack[-1] == '[':
                stack.pop()
            else:
                isStr = False
                break
        elif ch == ')':
            if stack and stack[-1] == '(':
                stack.pop()
            else:
                isStr = False
                break

    if isStr and not stack:
        print("yes")
    else:
        print("no")