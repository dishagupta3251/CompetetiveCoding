class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> ar=new ArrayList<>();
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            ar.add(index[i],nums[i]);
        }
        for(int i=0;i<ar.size();i++)
            arr[i]=ar.get(i);
        return arr;
    }
}