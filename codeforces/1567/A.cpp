#include <iostream>
#include <math.h>
#include <bits/stdc++.h>
#define ll long long
#define lli long long int
#define ld long double
using namespace std;

void init(){
cin.tie(0);
cin.sync_with_stdio(0);}
int main()
{ init();
int t,n;  string result="",s;
  cin>>t;
 while(t--){
    cin>>n;
    cin>>s;
    for(int i=0;i<n;i++){
        if(s[i]=='U')
            result+="D";
        else if(s[i]=='D')
            result+="U";
            else if(s[i]=='L')
            result+="L";
         else if(s[i]=='R')
            result+="R";

    }
 cout<<result<<endl;
 result="";
    }
    return 0;
}
