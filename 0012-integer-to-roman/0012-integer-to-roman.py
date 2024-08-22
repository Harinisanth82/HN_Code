class Solution:
    def intToRoman(self, num: int) -> str:
        res=""
        roman={
            "M":1000,"CM":900,"D":500,"CD":400,"C":100,"XC":90,
            "L":50,"XL":40,"X":10,"IX":9,"V":5,"IV":4,"I":1
        }
        count=0
        for rom,val in roman.items():
            if(num//val!=0):
                count=num//val
                res+=rom*count
                num=num%val
        return res
                