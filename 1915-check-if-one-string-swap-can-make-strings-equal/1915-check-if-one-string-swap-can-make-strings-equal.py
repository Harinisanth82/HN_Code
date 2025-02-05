class Solution:
    def areAlmostEqual(self, s1: str, s2: str) -> bool:
        if s1.lower()==s2.lower():
            return True
        if len(s1)!=len(s2):
            return False
        index=[]
        for i in range(len(s1)):
            if s1[i]!=s2[i]:
                index.append(i)
        if len(index)!=2:
            return False
        index1,index2=index[0],index[1]
        return s1[index1]==s2[index2] and s1[index2]==s2[index1]
