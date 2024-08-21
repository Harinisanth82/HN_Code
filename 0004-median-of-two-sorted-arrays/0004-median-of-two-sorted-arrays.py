class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        inp=nums1+nums2
        inp=sorted(inp)
        lgt=len(inp)
        if(lgt%2==0):
            val=int((lgt/2)-1)
            dmy=(inp[val]+inp[val+1])/2
            return float(dmy)
        elif(lgt%2!=0):
            val=int((lgt-1)/2)
            dmy=inp[val]   
            return float(dmy)