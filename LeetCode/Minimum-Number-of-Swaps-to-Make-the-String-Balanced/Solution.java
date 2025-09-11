class Solution:
    def minSwaps(self, s: str) -> int:
        balance = count = 0
        for c in s:
            balance += c == '['
            balance -= c == ']'
            if balance < 0:
                balance = 1
                count += 1
        return count