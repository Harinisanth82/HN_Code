class Solution:
    def replaceElements(self, arr: List[int]) -> List[int]:
        lgt=len(arr)
        maxnum=-1
        for i in range(lgt-1,-1,-1):
            current=arr[i]
            arr[i]=maxnum
            maxnum=max(maxnum,current)
        return arr