class Solution {
    public int bestClosingTime(String customers) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int i=-1;int maxSum=0;int res=0;int j=0;
        while(j<customers.length())
        {
            
          if(customers.charAt(j)=='Y')
                    res+=1;
          else
                     res+=-1;
            if(res>maxSum){
                maxSum=res;
                i=j;
            }
            j++;
        }
             
        return i+1;
        
    }
}