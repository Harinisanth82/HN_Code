class Solution:
    def distanceTraveled(self, mainTank: int, additionalTank: int) -> int:
        res=0
        while mainTank>=5 and additionalTank>0:
            res+=50
            mainTank=(mainTank-5)+1
            additionalTank-=1
        res=res+mainTank*10
        return res