class Solution:
    def isValid(self, s: str) -> bool:
        inp=[]
        dct={"[":"]","{":"}","(":")"}
        for i in s:
            if i in dct.keys():
                inp.append(i)
            else:
                if inp==[]:
                    return 0
                else:
                    if(dct[inp[-1]]==i):
                        inp.pop()
                    else:
                        return 0
        if(inp==[]):
            return 1
        else:
            return 0
