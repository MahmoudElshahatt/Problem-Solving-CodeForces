#include <iostream>
#include <math.h>
#include <bits/stdc++.h>
#define ll long long
using namespace std;
void init(){
cin.tie(0);
cin.sync_with_stdio(0);}
long long p1[200009];
long long p2[200009];
int main()
{ init();
 int n,k,q,x=0,l,r;  vector<int> v;
    cin>>n>>k>>q;
 while(n--){
    cin>>l>>r;
    p1[l]++;
    p1[r+1]--;
 }
 ll cntt=0;
  for(int i=0;i<200009;i++){
   cntt+=p1[i];
    if(cntt>=k)
        p1[i]=1; else
        p1[i]=0;
    }
for(int i=1;i<200009;i++){
    p2[i]=p2[i-1]+p1[i-1];
}
  while(q--){
   cin>>l>>r;
   cout<<p2[r+1]-p2[l]<<endl;

}
    return 0;

}
