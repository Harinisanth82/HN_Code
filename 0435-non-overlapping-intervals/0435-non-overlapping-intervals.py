class Solution:
    def eraseOverlapIntervals(self, intervals: List[List[int]]) -> int:
        lgt=len(intervals)
        if lgt==0:
            return 0
        
        intervals=sorted(intervals,key=lambda x:x[1])

        count=1
        prev=0
        for i in range(lgt):
            if intervals[i][0]>=intervals[prev][1]:
                prev=i
                count+=1
        return lgt-count