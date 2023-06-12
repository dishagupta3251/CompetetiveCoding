class Solution {
    public int[] separateDigits(int[] nums) {
        String s=Arrays.toString(nums);
            ArrayList<Integer> ar=new ArrayList<>();int k=0;
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))
               { ar.add(s.charAt(i)-'0');
                k++;
                }
        }
        int arr[]=new int[ar.size()];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=ar.get(i);
        }
        return arr;
}
}