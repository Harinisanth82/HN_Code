class Solution:
    def reverseVowels(self, s: str) -> str:
        l=0
        r=len(s)-1
        s=list(s)
        while(r>l):
            if s[l] not in "aeiouAEIOU":
                l+=1
            elif s[r] not in "aeiouAEIOU":
                r-=1
            else:
                temp=s[l]
                s[l]=s[r]
                s[r]=temp
                l+=1
                r-=1
        return "".join(s)