class Solution:
    def fizzBuzz(self, n: int) -> List[str]:
        store=[]
        for i in range(1,n+1):
            if i%3==0 and i%5==0:
                store.append("FizzBuzz")
            elif i%3==0:
                store.append("Fizz")
            elif i%5==0:
                store.append("Buzz")
            else:
                val=str(i)
                store.append(val)
        return store

