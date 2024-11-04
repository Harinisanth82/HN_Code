class Solution:
    def findNumbers(self, nums: List[int]) -> int:
        res=0
        for i in nums:
            lgt=len(str(i))
            if lgt%2==0:
                res+=1
        return res    