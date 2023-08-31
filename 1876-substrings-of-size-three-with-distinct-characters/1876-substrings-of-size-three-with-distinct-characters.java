class Solution {
    public int countGoodSubstrings(String s) {
        int j=0;int i=0;int c=0;
        HashSet<Character> hs=new HashSet<>();
        while(j<s.length())
        {
            hs.add(s.charAt(j));
            if(j<i+2)
                j++;
            else if(j==i+2)
            {
                if(hs.size()==3)
                    c++;
                hs.clear();
                i++;
                j=i;
                
            }
        }
        return c;
    }
}