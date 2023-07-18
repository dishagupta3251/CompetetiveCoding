class Solution {
    public int reverse(int x) {
        boolean isNegative=x<0?true:false;
        long res=0;
        if(isNegative==true)
        {
            x=x*-1;
        }
        while(x>0)
        {
            res=res*10+x%10;
            x=x/10;
        }
        if(res<Math.pow(-2,31) || res>Math.pow(2,31))
            return 0;
        res=isNegative==true?res*-1:res;
        return (int)res;
    }
}