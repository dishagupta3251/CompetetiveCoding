class Solution {
    public void rotate(int[][] matrix) {
        int ar[][]=new int[matrix.length][matrix[0].length];
         List<List<Integer>> arr=new ArrayList<>();
        
        for(int i=0;i<matrix.length;i++)
        {ArrayList<Integer> temp=new ArrayList<>();
            for(int j=0;j<matrix[0].length;j++)
            {
                   
                temp.add( matrix[j][i]);
            }
            Collections.reverse(temp);
            arr.add(temp);
        }
      
         for(int i=0;i<matrix[0].length;i++)
        {
            for(int j=0;j<matrix.length;j++)
            {
                matrix[i][j]=arr.get(i).get(j);
            }
        }
        
    }
}