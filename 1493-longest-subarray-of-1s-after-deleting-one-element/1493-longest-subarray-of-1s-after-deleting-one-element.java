class Solution {
    public int longestSubarray(int[] nums) {
        int f=0;int c=0;int max=0;int before=0;
        for(int i=0;i<nums.length;i++)
        {
            
             if(nums[i]!=1)
            {
                 max=Math.max(max,before+c);
                before=c;
                 c=0;
            }
            else c++;
            }
        if(c==nums.length)
            return c-1;
        return Math.max(max,before+c);
    }
}
