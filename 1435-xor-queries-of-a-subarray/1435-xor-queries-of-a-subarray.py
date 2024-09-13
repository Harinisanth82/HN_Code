class Solution:
    def xorQueries(self, arr: List[int], queries: List[List[int]]) -> List[int]:
        lgt=len(arr)
        res=[]
        prefix=[0 for i in range(0,lgt+1)]
        for i in range(0,lgt):
            prefix[i+1]=prefix[i]^arr[i]
        for l,r in queries:
            res.append(prefix[l]^prefix[r+1])
        return res  