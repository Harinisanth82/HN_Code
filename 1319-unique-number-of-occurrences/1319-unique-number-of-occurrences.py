class Solution:
    def uniqueOccurrences(self, arr: List[int]) -> bool:
        res={}
        for i in arr:
            if i in res:
                res[i]+=1
            else:
                res[i]=1
        val=[]
        for i,j in res.items():
            if j not in val:
                val.append(j)
            else:
                return False
        return True
        