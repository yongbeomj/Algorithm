class Solution:
    def longestPalindrome(self, s: str) -> str:
        if len(s) < 2:  # 입력 글자가 1글자인 경우
            return s

        result = ''

        for i in range(len(s)):
            # 양쪽 문자가 같을 경우 양쪽으로 1씩 범위를 늘림
            str1 = checkPalindrome(s, i, i)  # 홀수 길이 문자 검사
            str2 = checkPalindrome(s, i, i + 1)  # 짝수 길이 문자 검사

            result = max(result, str1, str2, key=len)  # 3개

        return result

def checkPalindrome(str, start_idx, end_idx):
    # 양쪽 문자가 같을 경우 양쪽으로 범위 늘려서 검사
    while start_idx >= 0 and end_idx < len(str) and str[start_idx] == str[end_idx]:
        start_idx -= 1
        end_idx += 1

    return str[start_idx + 1:end_idx]    
