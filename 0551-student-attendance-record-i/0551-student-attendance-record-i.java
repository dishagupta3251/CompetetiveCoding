class Solution {
    public boolean checkRecord(String s) {
        int countl=0;
        int max=1;
        int counta=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='A')
                counta++;
            
        }
        if(s.contains("LLL"))return false;
        if(counta>=2)
            return false;
        else
            return true;
        
    }
}