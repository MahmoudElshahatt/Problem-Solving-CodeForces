#include <iostream>
#include <math.h>
#include <bits/stdc++.h>
#define ll long long
using namespace std;
void init(){
cin.tie(0);
cin.sync_with_stdio(0);}
map <ll, ll> mp;
map <ll, ll>::iterator it;
int main()
{ init();
int n;
cin>>n;
ll a[n];
for(int i=0;i<n;i++){
        cin>>a[i];
}
sort(a,a+n);
for(ll i=0;i<n-1;i++){
   for(ll j=i+1;j<n;j++){
  mp[a[i]+a[j]]++;
   }
}
ll ans = 0;
    for(it = mp.begin(); it != mp.end(); it++){
        ans = max(ans, it->second);
    }
cout<<ans;
   return 0;
 }
