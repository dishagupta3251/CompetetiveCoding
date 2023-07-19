class Solution {
    public int minOperations(String s) {
        int c=0;
        int y=0;
        for(int i=0;i<s.length();i++)
      {  if(i%2==0 && s.charAt(i)=='1')
            c++;
        else if(i%2!=0 && s.charAt(i)=='0')
            c++;
        if(i%2==0 && s.charAt(i)=='0')
            y++;
        else if(i%2!=0 && s.charAt(i)=='1')
            y++;}
        return Math.min(c,y);
        
    }
}