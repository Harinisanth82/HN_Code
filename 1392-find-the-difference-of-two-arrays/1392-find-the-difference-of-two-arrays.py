class Solution:
    def findDifference(self, nums1: List[int], nums2: List[int]) -> List[List[int]]:
        res=[[],[]]
        for num in nums1:
            if (num not in nums2) and (num not in res[0]):
                res[0].append(num)
        for num in nums2:
            if (num not in nums1) and (num not in res[1]):
                res[1].append(num)
        
        return res