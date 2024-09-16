class Solution:
    def findMinDifference(self, timePoints: List[str]) -> int:
        mini=[]
        for i in timePoints:
            h,m=i.split(":")
            h,m=int(h),int(m)
            mini.append((h*60)+m)
        mini.sort()
        res=1440+mini[0]-mini[-1]
        for i in range(1,len(mini)):
            res=min(res,mini[i]-mini[i-1])
        return res