class Solution:
    def singleNumber(self, nums: List[int]) -> List[int]:
        res={}
        fny=[]
        for i in nums:
            if i in res:
                res[i]+=1
            else:
                res[i]=1
        for i,j in res.items():
            if j==1:
                fny.append(i)
        return fny