class Solution:
    def countPairs(self, nums: List[int], k: int) -> int:
        lgt=len(nums)
        count=0
        for i in range(lgt):
            for j in range(i+1,lgt):
                if (i*j)%k==0 and nums[i]==nums[j]:
                    count+=1
        return count