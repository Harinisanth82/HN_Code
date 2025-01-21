class Solution:
    def numJewelsInStones(self, jewels: str, stones: str) -> int:
        count={}
        for i in stones:
            if i in count:
                count[i]+=1
            else:
                count[i]=1
        res=0
        for i in jewels:
            if i in count:
                res+=count[i]
        return res