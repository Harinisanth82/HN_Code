class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        maxi=max(candies)
        res=[]
        for i in range(len(candies)):
            val=candies[i]+extraCandies
            if val>=maxi:
                res.append(True)
            else:
                res.append(False)
        return res