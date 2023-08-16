class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length==1)
        return 0;
        int l=0;int h=nums.length-1;int mid=0;
       while(l<=h)
       {
           mid=(l+h)/2;
           if((mid==0||nums[mid-1]<nums[mid])&&(mid==nums.length-1||nums[mid+1]<nums[mid]))
               break;
           else if(mid>0&&nums[mid-1]>nums[mid])
             h=mid-1;
           else
               l=mid+1;
       }
         return mid;  
    }
}