 class Solution {
    public int romanToInt(String s) {
        String  ar="IVXLCDM";
        int ref[]={1,5,10,50,100,500,1000};
        char ch;int k;int n=0;int l=s.length();int m=0;
        for(int i=0;i<l;i++)
        {
            
            
         if(i<l-1&&ar.indexOf(s.charAt(i))<ar.indexOf(s.charAt(i+1)))
         {n=n+(ref[ar.indexOf(s.charAt(i+1))]-ref[ar.indexOf(s.charAt(i))]);
         i++;
            }
              
              
               
              else {n=n+ref[ar.indexOf(s.charAt(i))];
            } 
                 
        }
return n;
        
    }
 }
   
