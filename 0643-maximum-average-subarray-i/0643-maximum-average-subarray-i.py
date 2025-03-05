class Solution:
    def findMaxAverage(self, nums: List[int], k: int) -> float:
        res=0
        for i in range(k):
            res+=nums[i]
        maxres=res
        start=0
        end=k
        while(end<len(nums)):
            res-=nums[start]
            start+=1

            res+=nums[end]
            end+=1
            maxres=max(res,maxres)

        return float(maxres)/k