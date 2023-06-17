class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        // ArrayList<Integer> ar=new ArrayList<Integer>();
        // for(int i=0;i<nums.length;i++)
        // {
        //     ar.add(nums[i]);
        // }
        // .sort(ar);
            int res=nums[nums.length-k];
        return res;
    }
}