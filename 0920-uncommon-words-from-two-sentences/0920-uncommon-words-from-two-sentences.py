class Solution:
    def uncommonFromSentences(self, s1: str, s2: str) -> List[str]:
        sample={}
        for a in s1.split():
            if a in sample:
                sample[a] += 1
            else:
                sample[a] = 1
        for b in s2.split():
            if b in sample:
                sample[b] += 1
            else:
                sample[b] = 1
        res=[]
        for i,j in sample.items():
            if j==1:
                res.append(i)
        return res