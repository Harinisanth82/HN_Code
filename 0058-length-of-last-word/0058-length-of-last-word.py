class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        inp = s.strip()
        count = 0
        for i in range(len(inp) - 1, -1, -1): 
            if inp[i].isspace():
                break
            count += 1
        return count
