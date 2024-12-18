class Solution:
    def isFascinating(self, n: int) -> bool:
        dmy={}
        val=str(n)+str(n*2)+str(n*3)
        val=int(val)
        while val>0:
            a=val%10
            if a in dmy:
                dmy[a]+=1
            else:
                dmy[a]=1
            val=val//10
        flg=0
        for i,j in dmy.items():
            if i==0 or j>1 or len(dmy)>9:
                flg=1
        if flg==1:
            return False    
        else:
            return True 