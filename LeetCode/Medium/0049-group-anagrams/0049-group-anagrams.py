class Solution:
    # key : value 로 접근
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagrams = {}

        for word in strs:
            sorted_word = ''.join(sorted(word)) # key

            if sorted_word in anagrams: # key가 이미 추가되어 있을 경우
                anagrams[sorted_word].append(word)
            else: # 신규 추가
                anagrams[sorted_word] = [word]

        results = list(anagrams.values())
        return results
        