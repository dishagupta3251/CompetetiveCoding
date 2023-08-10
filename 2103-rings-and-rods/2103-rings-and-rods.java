import java.util.*;
class Solution {
    public int countPoints(String rings) {
        HashMap<Character,String> map=new HashMap<>();
            for(int i=1;i<rings.length();i+=2)
            {
                if(map.containsKey(rings.charAt(i)))
                {
                    map.put(rings.charAt(i),map.get(rings.charAt(i))+rings.charAt(i-1));
                }
                else
                    map.put(rings.charAt(i),""+rings.charAt(i-1));
            }
        int c=0;
        for(Map.Entry<Character,String> hm :map.entrySet())
        {
            if(hm.getValue().contains("B")&&hm.getValue().contains("G")&&hm.getValue().contains("R"))
                c++;
        }
        return c;
    }
}