class Solution:
    def findMin(self, nums: List[int]) -> int:
        mini=nums[0]
        for i in nums:
            if(mini>i):
                mini=i
        return mini