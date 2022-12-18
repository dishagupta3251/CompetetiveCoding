class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int max=0;int max2=0;int sum=0;ArrayList<Integer> ar=new ArrayList<Integer>();
        int n=grid[0].length;             //storing numbers of columns in matrix
        int c=0;
        while(n>0)
        {for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if(grid[i][j]>max)
                { max=grid[i][j];          //calculating maximum value
                  c=j;
               }
              
            }
           
            grid[i][c]=0;                 //putting 0 to place where max value is found in a row
            ar.add(max);
            max=0;
          } 
          sum=sum+Collections.max(ar);
         ar.clear();                     //clearing arraylist to add max elements of each row of new matrix formed by adding 0's.
           n--;
         
        }
        return sum;
    }
}
