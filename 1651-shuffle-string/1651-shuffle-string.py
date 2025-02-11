class Solution:
    def restoreString(self, s: str, indices: List[int]) -> str:
        res=[1]*len(indices)
        k=0
        for i in indices:
            res[i]=s[k]
            k+=1
        return "".join(res)