class Solution:
    def isPossibleToSplit(self, nums: List[int]) -> bool:
        dmy={}
        for i in nums:
            if i in dmy:
                dmy[i]+=1
            else:
                dmy[i]=1
        for i in dmy.values():
            if i>2:
                return False
        return True