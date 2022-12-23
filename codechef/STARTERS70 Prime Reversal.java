import java.util.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0)
	{
	    int n=sc.nextInt();
	    String a=sc.next();
	    String b=sc.next();
	    int one1=0,zero1=0;int one2=0;int zero2=0;
	    	for(int i=0;i<n;i++)
		     {
		         if(a.charAt(i)=='0')
		         zero1++;
		         else
		         one1++;
		     }
		     for(int i=0;i<n;i++)
		     {
		         if(b.charAt(i)=='0')
		         zero2++;
		         else
		         one2++;
		     }
		     if(one1==one2&&zero2==zero1)
		     System.out.println("YES");
		     else
		     System.out.println("NO");
	    
	}
		
	
	}
}
