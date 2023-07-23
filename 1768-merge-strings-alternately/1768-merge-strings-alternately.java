class Solution {
    public String mergeAlternately(String word1, String word2) {
        String extra=word1.length()>word2.length()?word1.substring(word2.length(),word1.length()):word2.substring(word1.length(),word2.length());
        String res="";String comp=word1.length()<word2.length()?word1:word2;
        
                for(int i=0;i<comp.length();i++)
                {
                    res=res+word1.charAt(i)+word2.charAt(i);
                    }
            if(word1.length()==word2.length())
                return res;
        else
            return res+extra;
    }
}