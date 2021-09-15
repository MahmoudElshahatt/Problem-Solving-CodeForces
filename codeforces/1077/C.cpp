#include <iostream>
#include <math.h>
#include <bits/stdc++.h>
#define ll long long
using namespace std;
void init(){
cin.tie(0);
cin.sync_with_stdio(0);}
map<ll,ll> freq;
int main()
{ init();
 long long n,x,sum=0;   vector<int> v;
    cin>>n;
    ll a[n];
 for(int i=0;i<n;i++){
    cin>>a[i];
   sum+=a[i];
   freq[a[i]]++;
 }
 for(int i=0;i<n;i++){
        x=0;
        if(freq[a[i]]) x=1; freq[a[i]]--;
        ll ressum=sum-a[i];
    if(ressum%2==0&&freq[ressum/2]>0 ){
      v.push_back(i+1);
      }
if(x) freq[a[i]]++;
 }
 cout<<v.size()<<endl;
  for(int i=0;i<v.size();i++){
cout<<v[i]<<" ";}
    return 0;

}
