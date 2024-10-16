class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        lgt=len(nums)
        res=[1]*lgt
        prefix=1
        for i in range(lgt):
            res[i]=prefix
            prefix*=nums[i]
        postfix=1
        for i in range(lgt-1,-1,-1):
            res[i]*=postfix
            postfix*=nums[i]
        return res