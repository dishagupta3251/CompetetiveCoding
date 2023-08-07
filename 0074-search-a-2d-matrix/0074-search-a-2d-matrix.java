class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int k=0;int mid=0;int high=matrix[0].length-1;int low=0;
        int col=matrix[0].length-1;
        for(int i=0;i<matrix.length;i++)
        {
            if(target==matrix[i][col])
                return true;
           if(target<matrix[i][col])
              { k=i;
               break;
              }
            
        }
        System.out.println(k);
          while(low<=high)
          {  mid=(high+low)/2;
            if(target==matrix[k][mid])
                return true;
            else if(target<matrix[k][mid])
                high=mid-1;
             else
                 low=mid+1;
             
          }
        return false;
    }
}