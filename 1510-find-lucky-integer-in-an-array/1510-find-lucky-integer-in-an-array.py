class Solution:
    def findLucky(self, arr: List[int]) -> int:
        dmy={}
        for i in range(len(arr)):
            if arr[i] in dmy:
                dmy[arr[i]]+=1
            else:
                dmy[arr[i]]=1
        num=float('-inf')
        for i,j in dmy.items():
            if int(i)==int(j) and int(i)>num:
                num=i
        if num==float('-inf'):
            return -1
        return num


