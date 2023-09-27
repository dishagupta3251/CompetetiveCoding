class Solution {
    public int pivotInteger(int n) {
   if(n==1) return n;
        int temp = n , val = n;
        int sum = n*(n+1)/2;
        while(temp!=0){
            if(sum!=val){
                sum=sum-temp;
                temp--;
                val+=temp;
            }else return temp;
        }
        return -1;
    
    }
}