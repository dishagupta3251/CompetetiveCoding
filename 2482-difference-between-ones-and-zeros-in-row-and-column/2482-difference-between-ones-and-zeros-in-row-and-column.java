class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int row[]=new int[grid.length];
        int col[]=new int[grid[0].length];
        int res[][]=new int [grid.length][grid[0].length];
        int m=grid.length;int n=grid[0].length;
        int rz=0;
        int cz=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==0)
                    rz++;
            }
            row[i]=rz;
            rz=0;
           }
         for(int i=0;i<grid[0].length;i++)
        {
            for(int j=0;j<grid.length;j++)
            {
                if(grid[j][i]==0)
                    cz++;
            }
            col[i]=cz;
            cz=0;
           }
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                res[i][j]=(n-row[i])+(m-col[j])-row[i]-col[j];
            }
           }
        return res;
    }
}




  