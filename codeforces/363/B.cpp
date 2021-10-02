#include <bits/stdc++.h>
#define fast cin.tie(0); cin.sync_with_stdio(0);
#define ll long long
#define lli long long int
#define ld long double
using namespace std;

int main()
{
    ll mx = 150000001;
    fast
    ll n,k,pos;
    cin>>n>>k;
        ll a[n];
        ll pre[150002]={0};
  for(ll i=1;i<=n;i++){
    cin>>a[i-1];
    pre[i]=pre[i-1]+a[i-1];
    }
 for(ll i=k;i<=n;i++){
     ll sum=pre[i]-pre[i-k];
     if(mx>sum){
        mx=sum;
        pos=i;
     }
 }
    cout<<pos-k+1;

 return 0;

}
