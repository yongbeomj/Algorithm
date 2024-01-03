class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        # 1. 입력한 리스트를 정렬
        # 2. 처음부터 2의 간격으로 슬라이싱 (짝수번째 값만 추출)
        # 3. 추출한 모든 값을 더함
        return sum(sorted(nums)[::2])