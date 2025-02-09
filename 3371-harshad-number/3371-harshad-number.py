class Solution:
    def sumOfTheDigitsOfHarshadNumber(self, x: int) -> int:
        lgt=str(x)
        res=0
        for i in lgt:
            res+=int(i)
        if x%res==0:
            return res
        return -1