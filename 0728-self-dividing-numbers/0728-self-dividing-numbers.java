class Solution {
    int check(int m)
    {
        int n=m;int d=1;
        while(n>0&&n%10!=0)
        {
            d=n%10;
            if(m%d==0)
                n=n/10;
            else
                break;
        }
        return n==0?1:0;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ar=new ArrayList<>();
        for(int i=left;i<=right;i++)
        {
            if(check(i)==1)
                ar.add(i);
        }
         return ar;   
    }
}