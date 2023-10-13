class Solution {
    public int[] twoSum(int[] nums, int target) {
        int []res=new int[2]; int a=0;int b=0;
        if(nums.length==2)
            if(nums[0]+nums[1]==target)
                {res[0]=0;
                res[1]=1;}
        Map<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<nums.length;i++)
            map.put(nums[i],i);
        
        for(int i=0;i<nums.length;i++)
        {
            a=map.get(nums[i]);
            if(map.containsKey(target-nums[i])&&map.get(target-nums[i])!=i)
            {
                
               return new int[]{map.get(target-nums[i]),i};
            }
            
        }
        return res;
    }
}