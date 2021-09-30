#include <bits/stdc++.h>
using namespace std;
typedef long long int ll;
long long gcd(long long int a, long long int b)
{
  if (b == 0)
    return a;
  return gcd(b, a % b);
}
 

long long lcm(int a, int b)
{
    return (a / gcd(a, b)) * b;
}
int main()
{
    int test;
    cin>>test;
    for (int i = 0; i < test; i++)
    {
        ll k,l; cin >> k >> l;
    unordered_map<ll,ll> count;
    count[k]++;
    while(1){
        ll num = lcm(k,l);
        ll val = num/l;
        k=val;
        if(val==1){
            cout << "YES" << "\n";
            break;
           // return 0;
        }  
        if(count[val]>0){
            cout << "NO" << "\n";
            break;
            //return 0;
        }
        count[val]++;
    }
    }
}