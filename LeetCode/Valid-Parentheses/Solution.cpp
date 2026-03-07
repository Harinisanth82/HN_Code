1class Solution:
2    def isValid(self, s: str) -> bool:
3        inp=[]
4        dct={"[":"]","{":"}","(":")"}
5        for i in s:
6            if i in dct.keys():
7                inp.append(i)
8            else:
9                if inp==[]:
10                    return 0
11                else:
12                    if(dct[inp[-1]]==i):
13                        inp.pop()
14                    else:
15                        return 0
16        if(inp==[]):
17            return 1
18        else:
19            return 0
20