class Solution:
    def matrixReshape(self, mat: List[List[int]], r: int, c: int) -> List[List[int]]:
        val=[]
        res=[]
        n,m=len(mat[0]),len(mat)
        if (n*m)==(r*c):
            for i in mat:
                for j in i:
                    val.append(j)
            k=0
            v=c
            for j in range(r):
                res.append(val[k:c])
                k=c
                c+=v
            return res
        else:
            return mat