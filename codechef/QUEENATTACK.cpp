#include <iostream>
using namespace std;

int main() {
    int k,j,n,p,q;
    cin>>j;
    for(k=0;k<j;k++)
    {
        cin>>n>>p>>q;
        int ans;
	if(p==1 || p==n||q==n)
	{
	    ans =(n-1)*3;
	}
	    else{
	        ans=(n-1)*3;
	        if(p>n/2)
	        {
	            p=(n+1)-p;
	            
	        }
	         if(q>n/2)
	        {
	            q=(n+1)-q;
	            
	        }
	        int c=min(p,q);
	        if(n%2!=0 && p==q && p==(n/2)+1)
	        {
	            ans+=(n-1)*1;
	        }
	        else
	        {
	            ans+=(c-1)*2;
	        }
	    }
	    std::cout << ans << std::endl;
    }
	
	return 0;
}