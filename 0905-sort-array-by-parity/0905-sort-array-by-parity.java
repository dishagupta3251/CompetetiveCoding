class Solution {
    public int[] swap(int a,int b, int [] nums)
    {
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
        return nums;
    }
    public int[] sortArrayByParity(int[] nums) {
        
        if(nums.length==1)
            return nums;
        int j=nums.length-1;int i=0;
       while(i<=j)
       {
           if(nums[i]%2==0)i++;
            else if(nums[j]%2!=0) j--;
            else if(nums[i]%2!=0&&nums[j]%2==0)
               {swap(i,j,nums);
               i++;j--;}
           
       }
        return nums;
    }
}