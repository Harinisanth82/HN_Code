class Solution:
    def findDuplicates(self, nums: List[int]) -> List[int]:
        dup=[]
        inp=set()
        for i in nums:
            if i in inp:
                if i not in dup:
                    dup.append(i)
            else:
                inp.add(i)
        return dup