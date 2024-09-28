class Solution:
    def countNumbersWithUniqueDigits(self, n: int) -> int:
        res=10
        start = 9
        current = 9
        if(n==0):
            return 1
        while(n>1 and start>0):
            current*=start
            start-=1
            n-=1
            res+=current
        return res