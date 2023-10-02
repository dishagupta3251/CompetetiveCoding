class Solution {
    public boolean winnerOfGame(String colors) {
        int a=0;int b=0;
        if(colors.length()<=2)
            return false;
       for(int i=1;i<colors.length()-1;i++)
       {
           if(colors.charAt(i)=='B'&&colors.charAt(i-1)=='B'&&colors.charAt(i+1)=='B')
               b++;
       }
        for(int i=1;i<colors.length()-1;i++)
       {
           if(colors.charAt(i)=='A'&&colors.charAt(i-1)=='A'&&colors.charAt(i+1)=='A')
               a++;
       }
        if(a>b)
            return true;
        return false;
    }
}