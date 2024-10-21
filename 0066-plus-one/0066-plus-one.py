class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        carry,i=1,0
        digits=digits[::-1]
        lgt=len(digits)
        while carry:
            if i<lgt:
                if digits[i]==9:
                    digits[i]=0
                else:
                    digits[i]+=1
                    carry=0
                i+=1
            else:
                digits.append(1)
                carry=0
        return digits[::-1]