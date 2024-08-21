class Solution:
    def maxArea(self, height: List[int]) -> int:
        res=0
        lgt=len(height)
        l=0
        r=lgt-1
        while(r>l):
            area=(r-l)*min(height[l],height[r])
            res=max(res,area)
            if(height[l] < height[r]):
                l+=1
            else:
                r-=1
        return res