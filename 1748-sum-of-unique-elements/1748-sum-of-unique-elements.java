class Solution {
    public int sumOfUnique(int[] nums) {
        int sum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums)
            map.put(i, map.getOrDefault(i,0)+1);
        for(Map.Entry<Integer,Integer> hm:map.entrySet())
        {
            if(hm.getValue()==1)
                sum=sum+hm.getKey();
        }
        return sum;
    }
}