#include <bits/stdc++.h>
#define fast cin.tie(0); cin.sync_with_stdio(0);
#define ll long long
#define lli long long int
#define ld long double
using namespace std;
const int mx = 2e5+10;
ll t,n,arr[mx],ans;
int solve(){
  ll sum=0;
 for(int i=1;i<=n+1;i++)
    sum+=arr[i];
 if(sum==arr[n+1]*2)
    return n+1;
  for(int i=1;i<=n+1;i++)
    if(sum==arr[n+2]+arr[i])
        return i;
 return 0;
}
int main()
{
    fast
    int t;
    cin >> t;
    while(t--){
     cin >> n;
     for (int i=1;i<=n+2;i++)
            cin >> arr[i];
    sort(arr+1,arr+n+3);
    if(ans=solve()){
        for(int i=1;i<=n+1;i++)
             if(i!=ans)
                cout << arr[i] << " ";
          }
    else
        cout << "-1";

     cout << "\n";
   }
}
