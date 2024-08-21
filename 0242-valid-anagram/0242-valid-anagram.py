class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        lgt=len(s)
        if(len(s)==len(t)):
            if(sorted(s)==sorted(t)):
                return True 
        else:
            return False