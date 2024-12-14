class Solution:
    def countNegatives(self, grid: List[List[int]]) -> int:
        total=0
        for i in range(len(grid)):
            for j in range(len(grid[0])-1,-1,-1):
                if grid[i][j]<0:
                    total+=1
        return total