class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++)
        {
            if(matrix[i][0]==target)
                return true;
            if(matrix[i][0]<target)
            {
                for(int j=0;j<matrix[0].length;j++)
                {
                    if(matrix[i][j]==target)return true;
                }
                    
            }
                
        }
        return false;
    }
}