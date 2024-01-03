class Solution:
    def threeSum(self, nums: list[int]) -> list[list[int]]:
        result = []
        nums.sort() # 리스트 정렬
        
        if nums[0] > 0 or nums[-1] < 0: # 3개 숫자 합이 0이 안될 경우 빈 값 리턴
            return []

        for i in range(len(nums) - 2):
            if i > 0 and nums[i] == nums[i - 1]: # 연속된 값이 중복일 경우 건너뜀 (이미 전 단계에서 계산했으므로)
                continue

            start = i + 1  # 2번째 숫자
            end = len(nums) - 1  # 3번째 숫자

            while start < end:
                sum = nums[i] + nums[start] + nums[end]

                if sum > 0: # 양수면 더 작은 값을 더해줌
                    end -= 1
                elif sum < 0: # 음수면 더 큰 값을 더해줌
                    start += 1
                else:
                    result.append([nums[i], nums[start], nums[end]]) # 0인 경우 리스트에 추가
                    
                    # 중복 제거 (연속된 값이 중복될 경우 인덱스 건너뜀)
                    while start < end and nums[start] == nums[start + 1]:
                        start += 1
                    while start < end and nums[end] == nums[end - 1]:
                        end -= 1

                    start += 1
                    end -= 1

        return result
            