class Solution(object):
    def firstUniqChar(self, s):
        num_of_appear = Counter(s)
        if 1 not in num_of_appear.values():
            return -1
        for index, char in enumerate(s):
            if num_of_appear[char] == 1:
                return index
        return -1
        