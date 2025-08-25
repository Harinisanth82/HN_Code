class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l,r,m,n;
        m=matrix.length;
        n=matrix[0].length;
        l=0;
        r=(m*n)-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(matrix[mid/n][mid%n]==target)
                return true;
            else if(matrix[mid/n][mid%n]<target) 
                l=mid+1;
            else 
                r=mid-1;
        }
        return false;
    }
}