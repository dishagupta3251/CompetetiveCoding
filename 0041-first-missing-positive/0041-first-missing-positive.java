class Solution {
    public int firstMissingPositive(int[] nums) {
        List<Integer> arr=new ArrayList<>();int min=0;
        for(int i:nums)
            arr.add(i);
        Collections.sort(arr);
        int k=1;int i=0;
        while(i<arr.size())
        {
            if(arr.get(i)==k)
                k=k+1;
            i++;
            
        }
        return k;
    }
}