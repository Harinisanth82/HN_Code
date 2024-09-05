class Solution:
    def reverseOnlyLetters(self, s: str) -> str:
        s=list(s)
        l=0
        r=len(s)-1
        while(r>l):
            if(s[l].isalpha() and s[r].isalpha()):
                temp=s[l]
                s[l]=s[r]
                s[r]=temp
                l+=1
                r-=1
            elif(s[l].isalpha()):
                r-=1
            else:
                l+=1
        return "".join(s)  