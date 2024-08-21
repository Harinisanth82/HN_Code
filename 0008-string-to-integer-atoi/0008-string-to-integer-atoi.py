class Solution:
    def myAtoi(self, s: str) -> int:
        s=s.lstrip()
        if not s:
            return 0
        i=0
        sign=1
        if(s[i]=="+"):
            i+=1
        elif(s[i]=="-"):
            i+=1
            sign=-1
        val=0
        while(i<len(s)):
            dmy=s[i]
            if not s[i].isdigit():
                break
            else:    
                val=val*10+int(dmy)
            i+=1
        val=val*sign
        if(val > 2**31-1):
            return 2**31-1
        elif(val <= -2**31):
            return -2**31
        else:
            return val