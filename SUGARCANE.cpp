#include <iostream>
using namespace std;

int main() {
    int i,test;
    cin>>test;
    for(i=0;i<test;i++)
    { int n,a,l,b,profit,k;
        cin>>n;
        a = n*50;
        b = a*0.2;
        l = a*0.3;
        profit = b + b +l;
        k = a-profit;
        std::cout << k << std::endl;
    }
 return 0;
}
