class Solution:
    def relativeSortArray(self, arr1: List[int], arr2: List[int]) -> List[int]:
       dmy={}
       res=[]
       end=[]
       for i in arr1:
            if i not in arr2:
                end.append(i)
            if i in dmy:
                dmy[i]+=1
            else:
                dmy[i]=1
            
       end=sorted(end)
       for i in arr2:
            val=dmy[i]
            for j in range(val):
                res.append(i)
       return res+end