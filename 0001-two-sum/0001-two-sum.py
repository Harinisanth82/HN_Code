class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        lgt=len(nums)
        for i in range(0,lgt):
            for j in range(i+1,lgt):
                if(nums[i]+nums[j]==target):
                    return(i,j)