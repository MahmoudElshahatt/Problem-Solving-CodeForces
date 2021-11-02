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
    ll n,i=0,j=0;   string s,word;  vector<ll> v;
    cin>>n;
    while(n--){
    cin>>s;
    cin>>word;
    for(int l=0;l<s.size();l++){
        freq[(int)s[l]]=l;
    }
     for(int j=0;j<word.size();j++){
        v.push_back( freq[(int)word[j]]);
    }
        ll time=0;
        for(ll h=0;h<v.size()-1;h++){
            time+=abs(v[h]-v[h+1]);
        }
        cout<<time<<endl;
         v.clear();

    }

 return 0;

}
