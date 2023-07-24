class Solution {
    public String toLowerCase(String s) {
        String res="";
        for(int i=0;i<s.length();i++)
        {
            if(Character.isUpperCase(s.charAt(i)))
            res+=(char)((s.charAt(i)-'A')+'a');
            else
                res+=s.charAt(i);
        }
        return res;
    }
}