class Solution {
    int s=0;
    int cal(int[] arr,int n)
    {
        if(n>arr.length)
            return s;
        for(int i=0;i<arr.length-(n-1);i++)
        {
            for(int j=i;j<i+n;j++)
            {
                s=s+arr[j];
            }
        }
        
        n=n+2;
        return cal(arr,n);
    }
    public int sumOddLengthSubarrays(int[] arr) {
        int res=cal(arr,1);
        return res;
    }
}