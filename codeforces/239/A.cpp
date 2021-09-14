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
 
{
 
    int y, k, n;
 
    cin >> y >> k >> n;
 
    int x = k - y%k;
 
    if(x+y > n) return cout << -1 << endl , 0;
 
    for(int i = x ; i <= n-y; i+=k)
 
        cout << i << " ";
 
    return 0;
 
}
