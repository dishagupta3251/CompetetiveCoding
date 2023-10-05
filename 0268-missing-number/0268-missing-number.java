class Solution {
    public int missingNumber(int[] nums) {
        int s1=(nums.length*(1+nums.length))/2;
        int s2=0;
        for(int i=0;i<nums.length;i++)
        {
            s2=s2+nums[i];
        }
        return s1-s2;
    }
}