class Solution {
    public int findDuplicate(int[] nums) {
        int max=Arrays.stream(nums).max().getAsInt();
        int res[]=new int[max];
        for(int i=0;i<nums.length;i++)
        {
            res[nums[i]-1]++;
        }
        int ind=0;int maxi=0;
        for(int i=0;i<max;i++)
        {
            if(maxi<res[i])
            {
                maxi=res[i];
                ind=i;
            }
        }
        return ind+1;
    }
}