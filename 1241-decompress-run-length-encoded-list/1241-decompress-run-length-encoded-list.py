class Solution:
    def decompressRLElist(self, nums: List[int]) -> List[int]:
        a=[]
        for i in range(0,len(nums),2):
            for j in range(nums[i]):
                a.append(nums[i+1])
        return a