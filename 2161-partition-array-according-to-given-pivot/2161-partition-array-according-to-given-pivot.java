class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<pivot)
                res.add(nums[i]);
            
        }
         for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==pivot)
                res.add(nums[i]);       
        }
         for(int i=0;i<nums.length;i++)
        {
             if(nums[i]>pivot)
                res.add(nums[i]);
         }
        for(int i=0;i<res.size();i++)
        {
            nums[i]=res.get(i);
        }

            return nums;
    }
}