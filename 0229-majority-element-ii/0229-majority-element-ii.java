import java.util.*;
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ar=new ArrayList<Integer>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
                map.put(nums[i],map.get(nums[i])+1);
            else
                map.put(nums[i],1);
        }
        for(Map.Entry<Integer,Integer> hm:map.entrySet())
        {
            if(hm.getValue()>(nums.length/3))
                ar.add(hm.getKey());
        }
        return ar;
    }
}