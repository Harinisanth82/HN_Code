class Solution:
    def longestSubarray(self, nums: List[int]) -> int:
        tgt=max(nums)
        res=0
        size=0
        for i in nums:
            if(i==tgt):
                size+=1
            else:
                size=0
            res=max(res,size)
        return res