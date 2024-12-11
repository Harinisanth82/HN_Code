class Solution:
    def findRestaurant(self, list1: List[str], list2: List[str]) -> List[str]:
        dmy={}
        for i in range(len(list1)):
            dmy[list1[i]]=i
        mini=float("inf")
        for j in range(len(list2)):
            if list2[j] in dmy:
                summ=j+dmy[list2[j]]
                if summ<mini:
                    mini=summ
                    res=[]
                    res.append(list2[j])
                elif summ==mini:
                    res.append(list2[j])
        return res