class Solution {
    public int countPoints(String rings) {
         String ar[]=new String[10];int c=0;
        for(int i=0;i<rings.length();i++)
        {
            if(i%2!=0)
             {int k=rings.charAt(i)-'0';
              ar[k]=ar[k]+rings.charAt(i-1);
             }
        }
         for(int i=0;i<ar.length;i++)
        {
             if(ar[i]!=null)
             {if(ar[i].contains("B")&&ar[i].contains("G")&&ar[i].contains("R"))
                 c++;}
         }
       
        return c;
    }
}