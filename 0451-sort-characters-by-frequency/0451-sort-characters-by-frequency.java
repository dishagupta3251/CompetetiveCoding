class Solution {
    String reverse(String s)
    {String ns="";
        for(int i=s.length()-1;i>=0;i--)
        {
            ns=ns+s.charAt(i);
        }
     return ns;
        
    }
    public String frequencySort(String s) {
        Map<Character,Integer> map=new HashMap<>();
          Map<Character,Integer> sortedmap=new HashMap<>();
        String st="";
        char ch;
        for(int i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            if(map.containsKey(s.charAt(i)))
            {
                map.put(s.charAt(i),map.get(ch)+1);
            }
            else
            {
                map.put(s.charAt(i),1);
            }
        }
         List<Character> al = new ArrayList(map.keySet());
        Collections.sort(al,(a,b)->map.get(b)-map.get(a));
        
        StringBuilder sb = new StringBuilder();
        for(Object c: al){
            for(int i=0;i<map.get(c);i++){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}