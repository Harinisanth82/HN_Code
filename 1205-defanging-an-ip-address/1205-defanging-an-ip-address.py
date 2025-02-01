class Solution:
    def defangIPaddr(self, address: str) -> str:
        count=0
        address=str(address)
        for i in address:
            if i=='.':
                count+=1
        a=address.replace(".","[.]",count)
        return a