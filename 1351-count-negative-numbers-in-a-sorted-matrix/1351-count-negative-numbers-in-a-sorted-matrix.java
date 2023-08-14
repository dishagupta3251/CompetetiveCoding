class Solution {
    public int countNegatives(int[][] grid) {
        int n=grid[0].length-1;
        int c=0;
        for(int i=0;i<grid.length;i++)
        {
            if(grid[i][0]<0&&grid[i][n]<0)
                c=c+n+1;
            else if(grid[i][0]>0&&grid[i][n]>0)
                continue;
            else
           { for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]<0)
                    c=c+1;
            }
           }
        }
        return c;
    }
}