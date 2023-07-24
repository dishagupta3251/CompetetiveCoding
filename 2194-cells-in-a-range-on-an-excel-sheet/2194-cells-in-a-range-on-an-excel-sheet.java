class Solution {
    public List<String> cellsInRange(String s) {
        List<String> ls=new ArrayList<>();
        int col1=s.charAt(0);
        int col2=s.charAt(3);
        int r1=s.charAt(1);
        int r2=s.charAt(4);
        char ch[]=new char[2];
            for(int i=col1;i<=col2;i++)
            {
                for(int j=r1;j<=r2;j++)
                {
                     ch[0]=(char)i;
                     ch[1]=(char)j;
                     ls.add(String.valueOf(ch));
                }
               
            }
        
        return ls;
        
    }
}