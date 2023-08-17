import java.util.*;
class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        ArrayList<String> ar=new ArrayList<>();
        Collections.addAll(ar,words);
        int count=0;
        for(int i=0;i<ar.size();i++)
        {
            StringBuilder sb=new StringBuilder(ar.get(i));
            String s=sb.reverse().toString();
            ar.remove(ar.get(i));
            i=0;
            if(ar.contains(s))
            {
                int n=ar.indexOf(s);
                ar.remove(n);
                 count++;
            }
               
        }
        
      
        return count;
        
    }
}