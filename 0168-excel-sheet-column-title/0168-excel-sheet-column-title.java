class Solution {
    public String convertToTitle(int columnNumber) {
        String s="";
        int l=columnNumber;
        while(l>=1)
        {
            l--;
            s=(char)(l%26+65)+s;
            l=l/26;
        }
        return s;
    }
}