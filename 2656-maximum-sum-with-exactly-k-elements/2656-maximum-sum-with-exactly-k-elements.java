class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int l=nums[nums.length-1];
        int sum=l;
        for(int i=1;i<k;i++)
        {
            sum=sum+(++l);
        }
        return sum;
    }
}