class Solution {
    public boolean isSubsequence(String s, String t) {
        int k=0;
        if(s.length()==0||s.length()==0&&t.length()==0)
            return true;
        if(t.length()==0)
            return false;
        for(int i=0;i<t.length();i++)
        {
            if(k<s.length())
           { if(s.charAt(k)==t.charAt(i))
            {
                k++;
            }}
            else
                break;
        }
        if(k==s.length())
            return true;
        return false;
    }
}