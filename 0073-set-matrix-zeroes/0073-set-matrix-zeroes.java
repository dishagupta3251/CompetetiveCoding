class Solution {
    public void setZeroes(int[][] matrix) {
        List<Integer> row=new ArrayList<>();
         List<Integer> col=new ArrayList<>();
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==0){
                  { 
                      if(!row.contains(i))
                          row.add(i);
                      if(!col.contains(j))
                    col.add(j);}
                }
            }
        }
         for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(row.contains(i)||col.contains(j))
                matrix[i][j]=0;
            }
        }
        
       
    }
}