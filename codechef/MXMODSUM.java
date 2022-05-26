import java.util.*;
class Pro
{
    int c;int d;
    int calculate(int a,int b,int m)
    {
        c=a-b;
        if(c<0)
        {
           d=a+b+(Math.floorMod(c,m)); 
        }
        else{
            d=a+b+(c%m);
        }
        return d;
    }
    public static void main(String args[])
    {
        Pro obj=new Pro();
        Scanner sc= new Scanner(System.in);
        int t =sc.nextInt();
        for(int i=0;i<t;i++)
        {
            
        int n=sc.nextInt();
        int m=sc.nextInt();
        int ar[]=new int[n];int res;int max=0;
        for(int j=0;j<n;j++)
        {
            ar[j]=sc.nextInt();
        }
        for(int l=0;l<n;l++)
        {  int l1=ar[l];
            for(int k=0;k<n;k++)
            {
                int k1=ar[k];
                res=obj.calculate(l1,k1,m);
                if(res>max)
                {
                    max=res;
                }
            }
        }
        
          System.out.println(max);
        }
      
       
    }
}