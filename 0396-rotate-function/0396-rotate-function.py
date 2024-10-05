class Solution:
    def maxRotateFunction(self, nums: List[int]) -> int:
        lgt=len(nums)
        val=sum(i*nums[i] for i in range(lgt))
        ts=sum(nums)
        max_val=val
        for i in range(1,lgt):
            val = val + ts - lgt * nums[-i]
            max_val=max(max_val,val)
        return max_val 