class Solution {
    public String reverseOnlyLetters(String s) {
        StringBuilder sb=new StringBuilder(); 
        String res="";
        for(int i=s.length()-1;i>=0;i--)
        {
            if(Character.isAlphabetic(s.charAt(i)))
                sb.append(s.charAt(i));
        }
        // sb.reverse();
        int k=0;
        for(int i=0;i<s.length();i++)
        {
            if(Character.isAlphabetic(s.charAt(i)))                
               { 
                if(Character.isAlphabetic(s.charAt(i)))
                   { res=res+sb.charAt(k);
                k++;}
            }
                else
                    res=res+s.charAt(i);
            
        }
        
        return res;
    }
}