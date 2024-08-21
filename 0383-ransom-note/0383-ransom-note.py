class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        cnt=0
        lgt1=len(ransomNote)
        lgt2=len(magazine)
        rnd=list(ransomNote)
        mag=list(magazine)
        for i in range(0,lgt2):
            for j in range(0,lgt1):
                if(mag[i]==rnd[j] and mag[i]!='*' and rnd[j]!='*'):
                    rnd[j]='*'
                    mag[i]='*'
                    cnt+=1
                    break
        if(lgt1==cnt):
            return True
        else:
            return False