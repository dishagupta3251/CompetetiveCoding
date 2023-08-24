class Solution {
    public int countWords(String[] words1, String[] words2) {
        int ans=0;
        Map<String,Integer> map1=new HashMap<>();
        Map<String,Integer> map2=new HashMap<>();
        int c=0;int n=0;
        for(int i=0;i<words1.length;i++)
        {
            if(map1.containsKey(words1[i]))
                map1.put(words1[i],map1.get(words1[i])+1);
            else
            map1.put(words1[i],1);
        }
        for(int i=0;i<words2.length;i++)
        {
            if(map2.containsKey(words2[i]))
                map2.put(words2[i],map2.get(words2[i])+1);
            else
            map2.put(words2[i],1);
        }
        System.out.println(map1+" "+map2);
       for(Map.Entry<String,Integer>hm:map1.entrySet())
       {
           if(map2.containsKey(hm.getKey())&&map2.get(hm.getKey())==1&&map1.get(hm.getKey())==1)
               ans++;
       }
        return ans;
    }
}