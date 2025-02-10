class Solution:
    def clearDigits(self, s: str) -> str:
        res=[]
        for i in s:
            if i.isalpha():
                res.append(i)
            else:
                res.pop()
        return "".join(res)