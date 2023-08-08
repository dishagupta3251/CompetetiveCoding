class Solution {
    int Add(int n)
    {int a=0;
        if(n/10==0)
            return n;
        while(n>0)
        {
            a=a+n%10;
            n=n/10;
        }
       return Add(a);
    }
    public int addDigits(int num) {
        return Add(num);
    }
}