class Solution {
    public int[] sortArrayByParity(int[] nums) {
        
        if(nums.length==1)
            return nums;
        List<Integer> ar1=new ArrayList<>();
         List<Integer> ar2=new ArrayList<>();
        for(int i:nums)
        {
            if(i%2==0)
                ar1.add(i);
            else
                ar2.add(i);
        }
        ar1.addAll(ar2);
        int res[]=new int[ar1.size()];
        for(int i=0;i<ar1.size();i++)
            res[i]=ar1.get(i);
        return res;
    }
}