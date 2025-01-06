class Solution:
    def alternateDigitSum(self, n: int) -> int:
        res=0
        cnt=1
        for i in str(n):
            sign=1
            if cnt%2==0:
                sign=-1
            res+=int(i)*sign
            cnt+=1
        return res
