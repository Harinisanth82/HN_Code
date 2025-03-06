class Solution:
    def maxVowels(self, s: str, k: int) -> int:
        lgt=len(s)
        maxvow,winvow=0,0
        dmy={'a','e','i','o','u'}

        for i in range(k):
            if s[i] in dmy:
                winvow+=1
        maxvow=winvow

        for i in range(k,lgt):
            if s[i-k] in dmy:
                winvow-=1
            if s[i] in dmy:
                winvow+=1
            maxvow=max(winvow,maxvow)
        return maxvow