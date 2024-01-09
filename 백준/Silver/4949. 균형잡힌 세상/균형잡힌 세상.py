import sys

while True:
    # 문자열 입력
    sentence = sys.stdin.readline().rstrip()
    stack = []
    isStr = True

    # 온점일경우 중지
    if sentence == '.':
        break

    # 문자열 개수만큼 반복
    for ch in sentence:
        # 열린 괄호라면 stack에 삽입
        if ch == '[' or ch == '(':
            stack.append(ch)
        # 닫힌 괄호가 대괄호라면, stack에 삽입된 마지막 괄호가 열린 대괄호일 경우 pop. 아니면 반복문 중지
        elif ch == ']':
            if stack and stack[-1] == '[':
                stack.pop()
            else:
                isStr = False
                break
        # 닫힌 괄호가 소괄호라면, stack에 삽입된 마지막 괄호가 열린 소괄호일 경우 pop. 아니면 반복문 중지
        elif ch == ')':
            if stack and stack[-1] == '(':
                stack.pop()
            else:
                isStr = False
                break
    
    # isStr이 true이고 stack에 열린 괄호가 없으면 yes, 아니면 no
    if isStr and not stack:
        print("yes")
    else:
        print("no")
