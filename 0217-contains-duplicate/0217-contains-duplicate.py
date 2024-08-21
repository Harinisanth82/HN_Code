class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        lgt=len(nums)
        nums=set(nums)
        slgt=len(nums)
        if(lgt==slgt):
            return False 
        else:
            return True