class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        maxi=0
        val=0
        for i in range(len(nums)):
            if nums[i]==1:
                val+=1
                maxi=max(val,maxi)
            else:
                val=0
        return maxi
                