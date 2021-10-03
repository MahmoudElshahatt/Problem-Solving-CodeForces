#include <bits/stdc++.h>
#define fast cin.tie(0); cin.sync_with_stdio(0);
#define ll long long
#define lli long long int
#define ld long double
using namespace std;
int main()
{
    fast
    ll n,k,numtheorims=0,sum=0,mx=0;
    cin>>n>>k;
        ll th[n],atit[n];
        ll pre[1000000]={0};
  for(ll i=0;i<n;i++){
    cin>>th[i];
  }
  for(int i=0;i<n;i++){
    cin>>atit[i];
    if(atit[i]){
    numtheorims+=th[i];
    th[i]=0;
    }
  }
    for(ll i=1;i<=n;i++){
pre[i]=pre[i-1]+th[i-1];
  }
 for(ll i=k;i<=n;i++){
     sum=pre[i]-pre[i-k];
        mx=max(sum,mx);

 }

    cout<<numtheorims+mx;

 return 0;

}
