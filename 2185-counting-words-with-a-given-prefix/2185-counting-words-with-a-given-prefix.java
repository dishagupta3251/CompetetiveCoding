class Solution {
    public int prefixCount(String[] words, String pref) {
        int c=0;int l=pref.length();
        for(int i=0;i<words.length;i++)
        {
             if(words[i].length()>=l)
       { if(words[i].substring(0,l).contains(pref))
            c++;}
        }
        return c;
    }
}