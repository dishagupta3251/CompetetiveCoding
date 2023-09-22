class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int max=0;int row=0;int c=0;int ar[]=new int[2];
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                if(mat[i][j]==1)
                    c++;
            }
            if(c>max)
            {
                max=c;
                row=i;
            }
            c=0;
        }
        ar[0]=row;
        ar[1]=max;
        return ar;
    }
}