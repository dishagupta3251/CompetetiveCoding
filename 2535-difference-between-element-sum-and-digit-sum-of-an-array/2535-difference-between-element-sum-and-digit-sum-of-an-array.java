class Solution {
    int sum(int n)
    { int sum=0;
        while(n>0)
        {
            sum=sum+n%10;
            n=n/10;
        }
     return sum;
    }
    public int differenceOfSum(int[] nums) {
        int s_element=0;
        int s_digit=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>9)
            {
                s_digit+=sum(nums[i]);
            }
            else
            s_digit+=nums[i];
            s_element+=nums[i];
          
        }
          
        return Math.abs(s_element-s_digit);
    }
}