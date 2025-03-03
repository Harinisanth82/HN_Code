class Solution:
    def canPlaceFlowers(self, flowerbed: List[int], n: int) -> bool:
        res=0
        lgt=len(flowerbed)
        for i in range(lgt):
            if flowerbed[i]==0 and (i==0 or flowerbed[i-1]==0) and (i==lgt-1 or flowerbed[i+1]==0):
                res+=1
                flowerbed[i]=1
                if res>=n:
                    return True
        return res>=n