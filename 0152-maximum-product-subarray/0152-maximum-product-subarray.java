class Solution {
    public int maxProduct(int[] nums) {
       int max=Integer.MIN_VALUE;int f=1;int b=1;
       for(int i=0;i<nums.length;i++)
       {
           
            if(f==0)f=1;
           if(b==0)b=1;
            f=f*nums[i];
           b=b*nums[nums.length-i-1];
           max=Math.max(max,Math.max(f,b));
           
          
       }
       return max;
    }
}