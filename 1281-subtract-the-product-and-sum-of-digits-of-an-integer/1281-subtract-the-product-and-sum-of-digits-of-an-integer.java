class Solution {
    public int subtractProductAndSum(int n) {
        int d=0,sum=0,pro=1;
        while(n>0)
        {
            d=n%10;
            sum+=d;
            pro*=d;
            n=n/10;
        }
        return pro-sum;
    }
}