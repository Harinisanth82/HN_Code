class Solution:
    def sortColors(self, nums: List[int]) -> None:
        for i in range(0,len(nums)):
            for j in range(i+1,len(nums)):
                if nums[i]>nums[j]:
                    temp=nums[i]
                    nums[i]=nums[j]
                    nums[j]=temp
        return nums
        