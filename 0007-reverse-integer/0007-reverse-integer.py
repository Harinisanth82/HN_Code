class Solution:
    def reverse(self, x: int) -> int:
        cnt=0
        if(x<0):
            cnt=1
            x=abs(x)
        rev=0
        while(x>0):
            rem=int(x%10)
            rev=rev*10+rem
            x=int(x/10)
        if(cnt==1):
            rev=rev*-1
        if(rev<-2**31 or rev>2**31-1):
            return 0
        return rev