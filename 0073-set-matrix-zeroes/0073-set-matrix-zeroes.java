class Solution {
    public void setZeroes(int[][] matrix) {
        boolean first_row = false;
        boolean first_coloum = false;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    if(i==0) first_row=true;
                    if(j==0) first_coloum=true;
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        }  
        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }
        if(first_row){
            for(int j=0;j<matrix[0].length;j++){
                matrix[0][j]=0;
            }
        }
        if(first_coloum){
            for(int i=0;i<matrix.length;i++){
                matrix[i][0]=0;
            }
        }
    }
}