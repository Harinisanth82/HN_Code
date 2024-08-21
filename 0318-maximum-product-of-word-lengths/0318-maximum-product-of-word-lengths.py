class Solution:
    def maxProduct(self, words: List[str]) -> int:
        lgt=len(words)
        result=0
        for i in range(0,lgt):
            val=words[i]
            lgt1=len(val)
            lst=[0] * 256
            for j in range(0,lgt1):
                lst[ord(val[j])]=1
            for k in range(i+1,lgt):
                vall=words[k]
                lgt2=len(vall)
                common=0
                for y in range(0,lgt2):
                    if(lst[ord(vall[y])]==1):
                        common=1
                        break
                if(common==0):
                    product=lgt1*lgt2
                    if(product>result):
                        result=product
        return result