class Solution:
    def romanToInt(self, s: str) -> int:
        roman={"I":1,"V":5,"X":10,"L":50,"C":100,"D":500,"M":1000}
        lgt=len(s)
        res=0
        for i in range(0,lgt):
            if(i+1<lgt and roman[s[i]] < roman[s[i+1]]):
                res-=roman[s[i]]
            else:
                res+=roman[s[i]]
        return res
            