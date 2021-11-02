#include <bits/stdc++.h>
#define fast cin.tie(0); cin.sync_with_stdio(0);
#define ll long long
#define lli long long int
#define ld long double
using namespace std;
ll freq[1009];
int main()
{
    fast
    ll n;  ll step=0; ll p=1;
    cin>>n;
    while(n--){
    ll x,n;
    cin>>x>>n;
    ll remen=n-(n%4)+1;
while(remen<=n){
    if(x%2==0)
        x-=remen;
    else
          x+=remen;

          remen++;

}
cout<<x<<'\n';
}
 return 0;

}
