class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        dmy={}
        res=[]
        val=[]
        for i in range(len(nums)):
            if nums[i] in dmy:
                dmy[nums[i]]+=1
            else:
                dmy[nums[i]]=1
        for i,j in dmy.items():
            res.append([j,i])
        res=sorted(res)
        j=0
        for i in range(k):
            smy=res.pop(-1)
            a,b=smy
            val.append(b)
        return val 
        