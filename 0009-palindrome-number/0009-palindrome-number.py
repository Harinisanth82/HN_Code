class Solution:
    def isPalindrome(self, x: int) -> bool:
        inp=str(int(x))
        if(inp==inp[::-1]):
            return True
        else:
            return False