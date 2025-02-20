class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        inp=nums
        for i in range(len(nums)):
            inp.append(nums[i])
        return inp