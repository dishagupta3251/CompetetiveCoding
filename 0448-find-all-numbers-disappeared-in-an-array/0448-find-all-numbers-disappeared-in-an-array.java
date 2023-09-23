class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> num=new HashSet<>();
        for(int i: nums)
            num.add(i);
        List<Integer> res=new ArrayList<>();
        for(int i=1;i<=nums.length;i++)
        {
            if(!num.contains(i))
                res.add(i);
        }
        return res;
    }
}