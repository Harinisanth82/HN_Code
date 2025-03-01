class Solution:
    def applyOperations(self, nums: List[int]) -> List[int]:
        lgt=len(nums)
        res=[0]*lgt
        for i in range(lgt-1):
            if nums[i]==nums[i+1]:
                nums[i]*=2
                nums[i+1]=0
        
        k=0
        for i in range(lgt):
            if nums[i]!=0:
                res[k]=nums[i]
                k+=1
        return res