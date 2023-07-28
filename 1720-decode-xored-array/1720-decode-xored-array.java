class Solution {
    public int[] decode(int[] encoded, int first) {
        int ar[]=new int[encoded.length+1];
        ar[0]=first;
        for(int i=1;i<=encoded.length;i++)
        {
            ar[i]=ar[i-1]^encoded[i-1];
        }
        return ar;
    }
}