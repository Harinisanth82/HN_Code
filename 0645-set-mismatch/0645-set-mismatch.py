class Solution:
    def findErrorNums(self, nums: List[int]) -> List[int]:
        lgt=len(nums)
        a,b=-1,-1
        res=[0]*(lgt+1)
        for i in nums:
            res[i]+=1
        for i in range(1,lgt+1):
            if res[i]==2:
                a=i
            elif res[i]==0:
                b=i
        return [a,b]
