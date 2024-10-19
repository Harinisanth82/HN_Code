class Solution:
    def candy(self, ratings: List[int]) -> int:
        lgt=len(ratings)
        res=[1]*lgt
        for i in range(1,lgt):
            if ratings[i]>ratings[i-1]:
                res[i]=res[i-1]+1
        for i in range(lgt-2,-1,-1):
            if ratings[i]>ratings[i+1]:
                res[i]=max(res[i],res[i+1]+1)
        return sum(res)