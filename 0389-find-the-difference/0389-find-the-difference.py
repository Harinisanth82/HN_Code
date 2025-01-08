class Solution:
    def findTheDifference(self, s: str, t: str) -> str:
        dmy={}
        for i in t:
            if i in dmy:
                dmy[i]+=1
            else:
                dmy[i]=1
        for i in s:
            dmy[i]-=1
        for i,j in dmy.items():
            if j==1:
                return i