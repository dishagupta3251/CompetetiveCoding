class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int r=0;int l=0;
        int res=0;long total=0;
        for( r=0;r<nums.length;r++)
        {
            total+=nums[r];
            while (nums[r]*(r-l+1)>total+k)
            {
                total-=nums[l];
                    l+=1;
               
               
            }
             res=Math.max(res,r-l+1);
        }
        return res;
        
    }
}

     