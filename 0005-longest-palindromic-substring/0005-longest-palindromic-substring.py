class Solution:
    def longestPalindrome(self, s: str) -> str:
        def expand(s,left,right):
            max_lgt=0
            sub_str=''
            while left>=0 and right<len(s) and s[left]==s[right]:
                if right-left+1 > max_lgt:
                    max_lgt=right-left+1
                    sub_str=s[left:right+1]
                left-=1
                right+=1
            return sub_str
        result=''
        for i in range(0,len(s)):
            odd=expand(s,i,i)
            even=expand(s,i,i+1)
            if len(odd)>len(result):
                result=odd
            if len(even)>len(result):
                result=even
        return result