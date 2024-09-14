class Solution:
    def longestSubarray(self, nums: List[int]) -> int:
        size,lgt=0,0
        cur=0
        for i in nums:
            if i > cur:
                cur=i
                size=1
                res=0
            elif i==cur:
                size+=1
            else:
                size=0
            res=max(res,size)
        return res