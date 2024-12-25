class Solution:
    def sortPeople(self, names: List[str], heights: List[int]) -> List[str]:
        dmy={}
        res=[]
        for i in range(len(names)):
            dmy[heights[i]]=names[i]
        heights=reversed(sorted(heights))
        for i in heights:
            res.append(dmy[i])
        return res