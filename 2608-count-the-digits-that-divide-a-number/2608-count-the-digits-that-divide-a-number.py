class Solution:
    def countDigits(self, num: int) -> int:
        num=str(num)
        res=[int(a) for a in num]
        count=0
        for i in res:
            if int(num)%i==0:
                count+=1
        return count