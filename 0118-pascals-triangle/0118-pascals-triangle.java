class Solution {
    public List<Integer> ans(int n)
    {int res=1;
        List<Integer> arr=new ArrayList<>();
         arr.add(1);
     for(int i=1;i<n;i++)
        {
            res=res*(n-i);
            res=res/(i);
             arr.add(res);
            
        }
       return arr;
        
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ar=new ArrayList<>();
        for(int i= 1;i<=numRows;i++)
        {
            ar.add(ans(i));
        }
        return ar;
    }
}