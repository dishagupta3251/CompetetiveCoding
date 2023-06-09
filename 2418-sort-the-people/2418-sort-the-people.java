class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
      HashMap<Integer,String> map=new HashMap<>();
        int k=0;
        String[]res=new String[names.length];
        for(int i=0;i<names.length;i++)
        {
            map.put(heights[i],names[i]);
        }
       ArrayList<Integer> ar=new ArrayList<>(map.keySet());
        Collections.sort(ar);
        for (int j=ar.size()-1;j>=0;j--)
           {    
            res[k]=map.get(ar.get(j));
           k++;
        }
        
        return res;
        
            
    }
}
