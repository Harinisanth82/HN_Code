class Solution:
    def isHappy(self, n: int) -> bool:
        ans=set()
        while n not in ans:
            ans.add(n)
            cpy=0
            inp=n
            digit=0
            while inp:
                cpy=int(inp%10)
                digit+=cpy**2
                inp=int(inp/10)
            n=digit
            if n==1:
                return True
        return False