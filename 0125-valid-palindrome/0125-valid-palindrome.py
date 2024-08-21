class Solution:
    def isPalindrome(self, s: str) -> bool:
        inp=''.join(filter(str.isalnum,s))
        i=''.join(filter(str.isalnum,s))
        if(inp[::-1].lower()==i.lower()):
            return True
        else:
            return False