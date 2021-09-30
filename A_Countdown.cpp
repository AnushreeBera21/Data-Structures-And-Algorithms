#include<bits/stdc++.h>
using namespace std;
int main()
{
    long long t;
    cin>>t;
    while(t--)
    {
        long long n;
        cin >>n;
        char num[n+1];
        cin>>num;
        long long res=0;
        res = num[n-1]-'0';
        for(long long i=n-2;i>=0;i--)
        {
            if(num[i]!='0')
            {
                res+=num[i]-'0';
                res+=1;
            }
        }
        cout<<res<<endl;

    }
}
