class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character,Integer> map1=new HashMap<>();
        for(int i=0;i<t.length();i++)
        {
            if(map1.containsKey(t.charAt(i)))
                 map1.put(t.charAt(i),map1.get(t.charAt(i))+1);
            else
                 map1.put(t.charAt(i),1);
        }
            System.out.println(map1); 
        char ch=' ';
        for(int i=0;i<s.length();i++)
           { 
               if(map1.containsKey(s.charAt(i)))
            {
               map1.put(s.charAt(i),map1.get(s.charAt(i))-1);
            
            }
           
        }
        for(char m: map1.keySet())
            if(map1.get(m)==1)
                return m;
        System.out.println(map1);
        return ch;
    }
}