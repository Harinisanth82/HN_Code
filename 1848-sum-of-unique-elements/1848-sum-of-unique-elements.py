class Solution:
    def sumOfUnique(self, nums: List[int]) -> int:
        count={}
        for i in range(len(nums)):
            if nums[i] in count:
                count[nums[i]]+=1
            else:
                count[nums[i]]=1
        res=0
        for i,j in count.items():
            if j==1:
                res+=i
        return res
