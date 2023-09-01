class Solution {
    int count(String s)
    {
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
                c++;
        }
        return c;
    }
    public int[] countBits(int n) {
        int ar[]=new int[n+1];
        ar[0]=0;
        for(int i=1;i<=n;i++)
        {
            String temp=Integer.toBinaryString(i);
            ar[i]=count(temp);
        }
        return ar;
    }
}