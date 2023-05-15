class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] left=new int[nums.length];
        int[] right=new int[nums.length];
        int k=nums.length-1;
        int res[]=new int[nums.length];
        left[0]=0;
        right[k]=0;
        for(int i=0;i<nums.length-1;i++)
        {
        
                left[i+1]=left[i]+nums[i];
                right[k-1]=right[k]+nums[k];
            k--;
            
        }
        for(int i=0;i<nums.length;i++)
        {
            res[i]=Math.abs(left[i]-right[i]);
        }
        return res;
        
            }
}