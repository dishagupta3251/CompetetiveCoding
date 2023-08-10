import java.util.*;
class Solution {
    public int countPoints(String rings) {
        // HashMap<Character,String> map=new HashMap<>();
        //     for(int i=1;i<rings.length();i+=2)
        //     {
        //         if(map.containsKey(rings.charAt(i)))
        //         {
        //             map.put(rings.charAt(i),map.get(rings.charAt(i))+rings.charAt(i-1));
        //         }
        //         else
        //             map.put(rings.charAt(i),""+rings.charAt(i-1));
        //     }
        // int c=0;
        // for(Map.Entry<Character,String> hm :map.entrySet())
        // {
        //     if(hm.getValue().contains("B")&&hm.getValue().contains("G")&&hm.getValue().contains("R"))
        //         c++;
        // }
        String ar[]=new String[10];int c=0;
for(int i=1;i<rings.length();i=i+2)
{
    int index=(int)rings.charAt(i)-'0';
    ar[index]=ar[index]+rings.charAt(i-1);
}
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]!=null)
            {if(ar[i].contains("B")&&ar[i].contains("G")&&ar[i].contains("R"))
                c++;}
        }
        return c;
    }
}

