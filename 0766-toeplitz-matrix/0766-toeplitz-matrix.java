class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int k=matrix.length;
        int m=matrix[0].length;
        int p=k*m-(m+k);
        int c=0;
        for(int i=0;i<matrix.length-1;i++)
        {
            for(int j=0;j<matrix[0].length-1;j++)
            {
                if(matrix[i][j]==matrix[i+1][j+1])
                    c++;
            }
        }
        if(c==p+1)
            return true;
        return false;
        }
       
    }
